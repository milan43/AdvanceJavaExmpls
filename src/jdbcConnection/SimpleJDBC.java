/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcConnection;

/**
 *
 * @author Meelon
 */
import java.sql.*;

public class SimpleJDBC {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnect", "root", "");
        // String sql = "insert into info values(1,'Ram','Ktm')";
        String update = "update info set address='BKT'where id=?";
        
        String select="Select * from info";
        Statement s = con.createStatement();
        
        ResultSet rs=s.executeQuery(select);
        while(rs.next()){
            System.out.print(rs.getString("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("address")+"\t"+"\n");
        }
        con.close();
        System.out.println("selected");
       
    }
}
