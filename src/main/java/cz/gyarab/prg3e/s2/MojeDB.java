package cz.gyarab.prg3e.s2;

import java.sql.*;
import java.util.Scanner;

public class MojeDB {
    public static void main(String[] args) {
        /*
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc: ......");
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATETABLE .....");
        } catch(SQLException ex) {
            System.out.println("chyba...");

        } final {
            if (stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println("jsem v pr...");
                }
            if (conn != null)
                conn.close();
        }

         */

        String[] data = { "nula", "jedna", "dva", "tri"};
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS cislo2 (n INT, popis VARCHAR)");
            }

            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("INSERT INTO cislo2 VALUES (1, 'jedna')");
            }

            Scanner sc = new Scanner(System.in);
            int cislo = sc.nextInt();

            try (Statement stmt = conn.createStatement()) {
                try(ResultSet rs = stmt.executeQuery("SeLeCt * fRoM cislo2")) {
                    while(rs.next()) {
                        int n = rs.getInt(1);
                        String p = rs.getString(2);

                        System.out.println("n: " + n + " popis: " + p);
                    }

                }
            }


        } catch (SQLException ex) {
            System.out.println("Chyba: " + ex);
        }
    }
}
