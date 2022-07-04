

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColorGetServlet
 */
@WebServlet("/ColorGetServlet")
public class ColorGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ColorGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String color = request.getParameter("color"); //color is referring to parameter from the form
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter()	; //the response shd take writer to write to the request
		pw.println("<B>The selected color is: ");
		pw.println(color);  //print color
		pw.close(); 
	
}
//	<servlet>
//	<servlet-name>HelloServlet</servlet-name>
//	<servlet-class>HelloServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>HelloServlet</servlet-name>
//	<url-pattern>/HelloServlet</url-pattern>
//</servlet-mapping>
//
//
//<servlet>
//	<servlet-name>PostParametersServlet</servlet-name>
//	<servlet-class>PostParametersServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>PostParametersServlet</servlet-name>
//	<url-pattern>/PostParametersServlet</url-pattern>
//</servlet-mapping>
//
//<servlet>
//	<servlet-name>ColorGetServlet</servlet-name>
//	<servlet-class>ColorGetServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>ColorGetServlet</servlet-name>
//	<url-pattern>/ColorGetServlet</url-pattern>
//</servlet-mapping>
//
//<servlet>
//	<servlet-name>ColorPostServlet</servlet-name>
//	<servlet-class>ColorPostServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>ColorPostServlet</servlet-name>
//	<url-pattern>/ColorPostServlet</url-pattern>
//</servlet-mapping>
//
//<servlet>
//	<servlet-name>DateServlet</servlet-name>
//	<servlet-class>DateServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>DateServlet</servlet-name>
//	<url-pattern>/DateServlet</url-pattern>
//</servlet-mapping>
//
//<servlet>
//	<servlet-name>GetCookiesServlet</servlet-name>
//	<servlet-class>GetCookiesServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>GetCookiesServlet</servlet-name>
//	<url-pattern>/GetCookiesServlet</url-pattern>
//</servlet-mapping>

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
