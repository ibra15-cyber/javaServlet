

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SchoolForm
 */
@WebServlet("/SchoolForm")
public class SchoolForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter(); //get writer stream to prepare output to client
		//so the response is going to write
		Enumeration<String> e = request.getParameterNames(); 
		//get parameter name from the form1 of post parameter html from the request coming form client
		//so when a client try to access postparameters.html 
		//provide the form
		//after feeling and submitting 
		//the server should retrieve the name and of employee and his phone phonebook
		//and return to the client
		while(e.hasMoreElements()) { //if there are parameter names
			String pname = e.nextElement();	//point to that next element and save as pname
			pw.println(pname + " = ");
			String pvalue = request.getParameter(pname); //request parameter value of the parameter name
																							// so Employee and PhoneNum found in para name
																							//we then request the parameter value by passing the p name
			pw.println(pvalue); //if parameter name exist in the request
											//get that parameter name then get parameter name of the parameter name which is value
		}
		pw.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
