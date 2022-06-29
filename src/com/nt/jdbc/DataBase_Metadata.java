package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_Metadata {
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection con=null;
		DatabaseMetaData dbmd=null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		dbmd=con.getMetaData();
		
		if(dbmd!=null) {
			
			System.out.println("1)Database Name===>"+dbmd.getDatabaseProductName());
			System.out.println("2)Database Version===>"+dbmd.getDatabaseProductVersion());
			System.out.println("3)Database MajorVersion===>"+dbmd.getDatabaseMajorVersion());
			System.out.println("4)Database MinorVersion===>"+dbmd.getDatabaseMinorVersion());
			System.out.println("5)JDBC Major Version===>"+dbmd.getJDBCMajorVersion());
			System.out.println("6)JDBC Minor Version===>"+dbmd.getJDBCMinorVersion());
			System.out.println("7)JDBC Driver Name===>"+dbmd.getDriverName());
			System.out.println("8)JDBC Driver MajorVersion===>"+dbmd.getDriverMajorVersion());
			System.out.println("9)JDBC Driver Version===>"+dbmd.getDriverMinorVersion());


		}
		
		}//try
		catch (SQLException se) {
        se.printStackTrace();
		}
		catch (ClassNotFoundException se) {
	        se.printStackTrace();
			}
		catch (Exception e) {
	        e.printStackTrace();
			}
		finally {
			con.close();
		}
	}

}
