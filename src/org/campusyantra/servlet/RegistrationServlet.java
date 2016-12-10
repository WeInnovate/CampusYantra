package org.campusyantra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.campusyantra.dao.service.TraineeService;
import org.campusyantra.dao.util.DAOFactory;
import org.campusyantra.dto.Trainee;

/**
 * Servlet implementation class RegisterationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isRegSeccess = false;

		long id = System.currentTimeMillis();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");

		TraineeService trnService = DAOFactory.getTraineeService();

		if(trnService.saveLoginDetails(email, password)){
			Trainee trn = new Trainee(id, name, email, gender, Long.parseLong(phone));
			isRegSeccess = trnService.register(trn);
		}

		if(isRegSeccess){
			HttpSession ses = request.getSession();
			ses.setAttribute("name", email);
			response.sendRedirect("index.jsp");	
		}
		else{
			response.sendRedirect("registration.jsp");
		}

	}

}
