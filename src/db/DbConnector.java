package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {

    private static Connection conn = null;

    public static Connection getConnection() {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursejdbc?verifyServerCertificate=false&useSSL=true", "root", "1234567");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conn;
    }
    public static void closeConnection() {
        if(conn != null) {
            try {
                conn.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
