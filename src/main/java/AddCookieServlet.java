

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String data = request.getParameter("data");
		Cookie cookie = new Cookie("MyCookie", data);
		response.addCookie(cookie);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter()	;
//		pw.println("<B>MyCookie has been set to: ");
//		pw.println(data); 
		pw.println("<B>Thanks for your submission!");
		pw.close();
	
		
		//so when a client try to access the app cookie html a form is presented to be filled
		//the form is sent here and the print out is thanks for submission
		
		//i the administrator can lunch getcookiesservlet to get the input from users
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
