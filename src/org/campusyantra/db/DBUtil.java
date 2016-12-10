package org.campusyantra.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.campusyantra.dto.Trainee;

public class DBUtil {
	Connection con;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public Connection getConnection() {

		try {
			// Loading the driver class
			Class.forName("org.h2.Driver");
			// Establishing the connection with data source
			
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

	public boolean doLogin(String userName, String password) {
		boolean result = false;

		try {
			getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CY_LOGIN");
			
			while(rs.next()){
				String uName = rs.getString(1);
				String pass = rs.getString(2);
				
				if(userName.equals(uName) && password.equals(pass)){
					result = true;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	public void register(Trainee trn) {
		try{
			getConnection();
			pstmt = con.prepareStatement("INSERT INTO CY_REG VALUES(?, ?, ?, ?)");
	pstmt.setString(1, trn.getName());
	pstmt.setString(2, trn.getEmail());
	pstmt.setString(3, trn.getGender());
	pstmt.setInt(4, trn.getMobile());
	int i = pstmt.executeUpdate();
	
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public int saveLoginDetails(String userName, String password) {
		int i = -1;
		try{
			getConnection();
			pstmt = con.prepareStatement("INSERT INTO CY_LOGIN VALUES(?, ?)");
	pstmt.setString(1, userName);
	pstmt.setString(2, password);
	
	 i = pstmt.executeUpdate();
	
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
}