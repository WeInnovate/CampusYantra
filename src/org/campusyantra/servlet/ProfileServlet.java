package org.campusyantra.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.campusyantra.dao.service.CourseService;
import org.campusyantra.dao.util.DAOFactory;
import org.campusyantra.dto.Course;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(false);
		CourseService courseService = DAOFactory.getCourseService();
		List<Course> moduleList = courseService.getAllModules();
		List<List<String>> enrlModuleList = courseService.getEnrlModules(ses.getAttribute("name").toString());
		
		ses.setAttribute("enrlModules", enrlModuleList);
		ses.setAttribute("modules", moduleList);
		request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
	}
}
