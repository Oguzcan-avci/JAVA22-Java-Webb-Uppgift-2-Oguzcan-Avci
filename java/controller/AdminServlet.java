package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import model.Admin;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Admin admin = new Admin();
	
    public AdminServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String adminsName = request.getParameter("admin");
		String adminPwd = request.getParameter("adminPassword");
		
		if (adminsName.equals("admin")&& adminPwd.equals("admin")) {
			
			admin.setAdminName(adminsName);
			admin.setAdminPassword(adminPwd);
			request.getSession().setAttribute("admin", admin);
			
			RequestDispatcher dp = request.getRequestDispatcher("AdminSuccess.jsp");
			dp.forward(request, response);
		}else {
			response.sendRedirect("Admin.jsp");
		}
	}

}
