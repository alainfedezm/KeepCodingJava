package com.tomcat;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LogInservlet
 */
@WebServlet("/login")
public class LogInservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		validarParametrosLogIn(request,response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	private void validarParametrosLogIn(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String usuario = request.getParameter("user");
		String contrasena = request.getParameter("password");
		
		if(usuario.equals("alain") & contrasena.equals("123")) {
			PrintWriter r = response.getWriter();
			r.append("usuario hackkkkkkk ");
			System.out.println("Bienvenido " + usuario );
		}
		
	}
	
	public void headers(HttpServletRequest request) {
		Enumeration<String> header = request.getHeaderNames();
		while(header.hasMoreElements()) {
			String parameter =header.nextElement();
			System.out.println(request.getHeader(parameter));
		}
	}
	
	public void parameters(HttpServletRequest request) {
		Enumeration<String> header = request.getParameterNames();
		while(header.hasMoreElements()) {
			String parameter =header.nextElement();
			System.out.println(request.getParameter(parameter));
		}
	}
	
	
	

}
