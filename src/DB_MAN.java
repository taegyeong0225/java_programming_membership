
import java.io.*;
import java.util.*;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migyu
 */

public class DB_MAN {
        String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strURL = "jdbc:sqlserver://localhost:1433;DatabaseName=member;";
        
        String strUser = "sa";
        String strPWD = "inha1958";
        
        Connection DB_con;
        Statement DB_stmt;
        ResultSet DB_rs;
        
        public void dbOpen() throws IOException {
            try {
                Class.forName(strDriver);
                strURL += "encrypt=true;trustServerCertificate=true;";
                DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
                DB_stmt = DB_con.createStatement();
            } catch (Exception e) {
                System.out.println("SQLException : " + e.getMessage());
            }
        }
        public void dbClose() throws IOException {
            try {
                DB_stmt.close();
                DB_con.close(); 
            } catch (Exception e) {
                System.out.println("SQLException : " + e.getMessage());
            }
        }
    }