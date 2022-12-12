package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	User user = new User();
	
    
	
    public UserServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("user");  //Hämtar namn och lösen från form
		String userPwd = request.getParameter("userPassword");
		
		if (userName.equals("user")&& userPwd.equals("user")) {
				user.setUserName(userName);
				user.setUserPassword(userPwd);
				request.getSession().setAttribute("user", user);
				
				RequestDispatcher dp = request.getRequestDispatcher("UserSuccess.jsp");
				dp.forward(request, response);
				
			}else {
				response.sendRedirect("User.jsp");
				
			}
		
		
	//	}else {
		//	request.getRequestDispatcher("User.jsp");
			
	//	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

