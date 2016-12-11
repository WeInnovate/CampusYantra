package org.campusyantra.dao.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.campusyantra.dao.service.TraineeService;
import org.campusyantra.dao.util.ConnectionFactory;
import org.campusyantra.dao.util.ReleaseResources;
import org.campusyantra.dto.Trainee;

public class TraineeServiceImpl implements TraineeService {
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement ps;

	@Override
	public boolean login(String userName, String password) {
		boolean returnVal = false;
		try {
			con = ConnectionFactory.getConnecction();
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM CY_LOGIN");
			
			while(rs.next()){
				if(rs.getString(1).equals(userName) && rs.getString(2).equals(password)){
					returnVal = true;
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			ReleaseResources.closeResultSet(rs);
			ReleaseResources.closeStatement(stmt);
			ReleaseResources.closeConnection(con);
		}
		
		return returnVal;
	}

	@Override
	public boolean register(Trainee trn) {
		boolean returnVal = false;
		
		try {
			con = ConnectionFactory.getConnecction();
			ps = con.prepareStatement("INSERT INTO CY_TRAINEE VALUES(?, ?, ?, ?, ?)");
			
			ps.setLong(1, trn.getId());
			ps.setString(2, trn.getName());
			ps.setString(3, trn.getEmail());
			ps.setString(4, trn.getGender());
			ps.setLong(5, trn.getMobile());
			
			int i = ps.executeUpdate();
			
			if(i > 0){
				returnVal = true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			ReleaseResources.closeResultSet(rs);
			ReleaseResources.closePreparedStatement(ps);
			ReleaseResources.closeConnection(con);
		}
		
		return returnVal;
	}

	@Override
	public boolean update(Trainee trn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getTraineeByEmail(String email) {
		
	}

	@Override
	public boolean deleteProfile(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveLoginDetails(String userName, String password) {
		boolean returnVal = false;
		
		try {
			con = ConnectionFactory.getConnecction();
			stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO CY_LOGIN VALUES('"+userName+"', '"+password+"')");
			if(i > 0){
				returnVal = true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			ReleaseResources.closeStatement(stmt);
		}
		
		return returnVal;
	}

}
