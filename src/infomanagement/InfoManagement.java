/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package infomanagement;

/**
 *
 * @author regie
 */
import java.sql.*;
public class InfoManagement {

    /**
     * @param args the command line arguments
     */
    private static final String username = "root";
    private static final String password = "Phantomseeker_13";
    private static final String dataConn = "jdbc:mysql://127.0.0.1:3306/dbbookingform";
    private static Connection sqlConn = null;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            System.out.println("Connection Success");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return sqlConn;
    }
    
    public static void main(String[] args){
        getConnection();
    }
}
