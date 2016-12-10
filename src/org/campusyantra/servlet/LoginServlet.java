package org.campusyantra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.campusyantra.db.DBUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String pass = request.getParameter("password");
		
		DBUtil dbu = new DBUtil();
		boolean result = dbu.doLogin(name, pass);
		
		if(result){
			HttpSession ses = request.getSession();
			ses.setAttribute("name", name);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else{
			response.sendRedirect("login.jsp");;
		}
		
		
		
	}

}
