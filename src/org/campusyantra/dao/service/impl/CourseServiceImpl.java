package org.campusyantra.dao.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.campusyantra.dao.service.CourseService;
import org.campusyantra.dao.util.ConnectionFactory;
import org.campusyantra.dao.util.ReleaseResources;
import org.campusyantra.dto.Course;

public class CourseServiceImpl implements CourseService {

	Connection con;
	Statement stmt;
	ResultSet rs;

	@Override
	public List<Course> getAllModules() {
		List<Course> modules = new ArrayList<Course>();
		try {
			con = ConnectionFactory.getConnecction();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CY_COURSE");

			while (rs.next()) {
				int courseID = rs.getInt(1);
				String courseName = rs.getString(2);
				String trainerName = rs.getString(3);
				String module = rs.getString(4);
				String[] modulesArr = module.split(",");
				List<String> modulesList = Arrays.asList(modulesArr);
				Course course = new Course(courseID, courseName, trainerName,
						modulesList);
				modules.add(course);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
//			ReleaseResources.closeConnection(con);
		}
		return modules;
	}

	@Override
	public List<List<String>> getEnrlModules(String userName) {
		List<String> row = null;
		List<List<String>> rnrlModules = new ArrayList<List<String>>();
		try {
			con = ConnectionFactory.getConnecction();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CY_COURSE_module where username = '"+userName+"'");

			while (rs.next()) {
				row = new ArrayList<String>();
				String courseName = rs.getString(1);
				String moduleName = rs.getString(2);
				row.add(courseName);
				row.add(moduleName);
				
				rnrlModules.add(row);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
//			ReleaseResources.closeConnection(con);
		}
		return rnrlModules;

	}

}
