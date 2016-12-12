package org.campusyantra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EnrollmentServlet
 */
@WebServlet("/EnrollmentServlet")
public class EnrollmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EnrollmentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String courseName = request.getParameter("courseName");
		String moduleName = request.getParameter("moduleName");
		System.out.println(moduleName+" "+courseName);
		HttpSession ses = request.getSession(false);
		String user = (ses != null) ? (String) ses.getAttribute("name")
				: null;
		if (user != null) {
			request.getRequestDispatcher("WEB-INF/profile.jsp").forward(
					request, response);
		} else {
			response.sendRedirect("login.jsp");
		}

	}

}
