package de.othr;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scan.nextLine();

            con = DriverManager.getConnection("jdbc:postgresql://localhost/u1", "u1", "u1");

            if(name.isEmpty()) {
                /* Alle Kontakte ausgeben */
                Statement stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT name, handynummer, gesucht FROM kontakte ORDER BY name");
                while(rs.next()) {
                    System.out.printf("%s: %s (%d)\n", rs.getString(1), rs.getString(2), rs.getInt(3));
                }
            } else {
                /* Suchfunktion */
                PreparedStatement stmt = con.prepareStatement("SELECT name, handynummer, gesucht FROM kontakte WHERE name = ?");
                stmt.setString(1, name);
                rs = stmt.executeQuery();
                if(rs.next()) {
                    PreparedStatement stmt2 = con.prepareStatement("UPDATE kontakte SET gesucht = gesucht+1 WHERE name = ?");
                    stmt2.setString(1, name);
                    stmt2.executeUpdate();
                    System.out.printf("%s: %s (%d)\n", rs.getString(1), rs.getString(2), rs.getInt(3)+1);
                } else {
                    System.out.println("Kein Kontakt gefunden.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(con != null) {
                    con.close();
                }
                if(rs != null) {
                    rs.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
