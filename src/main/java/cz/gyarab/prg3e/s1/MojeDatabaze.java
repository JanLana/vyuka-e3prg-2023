package cz.gyarab.prg3e.s1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MojeDatabaze {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            try(Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS cislo (n INT NOT NULL)");
            }


            for (int i = 1; i < 110; i++) {
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate("INSERT INTO cislo VALUES (" + i + ")");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
