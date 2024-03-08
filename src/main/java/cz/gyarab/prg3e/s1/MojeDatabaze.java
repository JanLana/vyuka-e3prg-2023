package cz.gyarab.prg3e.s1;

import java.sql.*;
import java.util.Scanner;

public class MojeDatabaze {
    public static void main(String[] args) {
        String[] slova = { "nula", "jedna", "dva", "tri", "ctyri", "pet"};

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(
                        "CREATE TABLE IF NOT EXISTS slova (" +
                                "n INT NOT NULL," +
                                "popis VARCHAR NOT NULL" +
                                ")");
            }

/*
            for (int i = 0; i < slova.length; i++) {
                try (Statement stmt = conn.createStatement()) {
                    String sql = "INSERT INTO slova VALUES (" + i + ", '" + slova[i] + "')";
                    System.out.println(sql);
                    stmt.executeUpdate(sql);
                }
            }
*/

            Scanner sc = new Scanner(System.in);
            for (; ; ) {
                int cislo = sc.nextInt();
                try (Statement stmt = conn.createStatement()) {
                    ResultSet rs = stmt.executeQuery("SELECT popis FROM slova WHERE n=" + cislo);
                    while (rs.next()) {
                        String p = rs.getString(2);
                        int n = rs.getInt(1);

                        System.out.println("radek: " + n + " = " + p);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

