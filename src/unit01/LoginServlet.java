package unit01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = "pinkyoon";
		String pwd = "1234";
		String name = "윤한석";
		System.out.printf("%s%n %s%n %s%n", id, pwd, name);
		
		request.setAttribute("userid", id);
		request.setAttribute("userpwd", pwd);
		request.setAttribute("name", name);
		
		if ( id.equals(request.getParameter("userid")) &&
				pwd.equals(request.getParameter("userpwd"))) {
			response.sendRedirect("10_main.jsp");
		} else {
			response.sendRedirect("10_loginForm.jsp");
		}
	}

}
