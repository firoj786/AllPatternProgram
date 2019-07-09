package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		int count=0;
		try{
			//register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			//create Statement object
			if(con!=null)
				st=con.createStatement();
			//send and execute SQL Query
			if(st!=null)
				count=st.executeUpdate("create table temp1(col1 number(5))");
			//process the Result
			System.out.println(count);
			if(count==0)
				System.out.println("Table  created");
			else
				System.out.println("table not Created");
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
		  cnf.printStackTrace();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//close jdbc objs
			
			try{
				if(st!=null)
					st.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}//finally
	}//main
}//class
