package pl.n2god;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author n2god on 06/12/2019
 * @project scopes
 */
@WebServlet(name ="LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		if(request.getAttribute("login") == null){
			request.setAttribute("login", login);
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Witaj " + request.getAttribute("login"));
		writer.println("</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Witaj: " + request.getAttribute("login"));
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
