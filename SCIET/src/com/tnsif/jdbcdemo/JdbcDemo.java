package com.tnsif.jdbcdemo;

public class JdbcDemo {
	
	private static String DRIVERNAME="org.postgresql.Driver";
	
	private static String Username="postgres";
	
	private static String Password="Admin123";
	
	private static String URL="jdbc:postgresql://localhost:5432/SCIET";
	
	public static void main(String[] args)  {
		
		Class.forName(DRIVERNAME);
		System.out.println("driver loaded");
		
		
		Connection con=DriverManager.getConnection(URL,Username,Password);
		System.out.println("connection established");
		//create statement
		Statement stmt=con.createStatement();
		
		//execute the query
		String query="select * from student";
		
		ResultSet rs=stmt.executeQuery(query);
		
	    //retrieving the data
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		//close the connection
		stmt.close();
		con.close();
	}
}

