import java.sql.*;

public class jdb {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            String usr = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/world";

            Connection con = DriverManager.getConnection(url, usr, pass);

            Statement smt = con.createStatement();
            String query = "SELECT * FROM world";

            ResultSet rs = smt.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString(1)+" | "); // corrected index
                System.out.print(rs.getString(2)+" | "); // corrected index
                System.out.print(rs.getInt(3)+" | "); // corrected index
                System.out.print(rs.getString(4)+" | "); 
                System.out.println();// corrected index
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
