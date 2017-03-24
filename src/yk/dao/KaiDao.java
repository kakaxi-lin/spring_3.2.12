package yk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class KaiDao {
	Connection conn;
	PreparedStatement stmt;
	private String url="jdbc:mysql://130.10.7.123:3306/tx";
	private String uname="root";
	private String pwd="fendou";
	public KaiDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//conn = DriverManager.getConnection("jdbc:mysql://130.10.7.122:3306/tx", "root", "fendou");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void open(){
		try {
			conn = DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(String name){
		try {
			stmt = conn.prepareStatement("insert into tx(name) values(?)");
			stmt.setString(1, name+(new Random().nextInt(100)+1));
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		System.out.println("insert over...");
	}
	
	public void close(){
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
