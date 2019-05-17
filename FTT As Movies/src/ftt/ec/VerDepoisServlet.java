package ftt.ec;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerDepoisServlet {

	ArrayList<String> dados = new ArrayList<String>();
	
	public VerDepoisServlet() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//this.dados.add("Didi Cachorro da Estrada");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		//Usuario usuario = this.dados.get(id);
		
		response.getWriter().append("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Usuario usuario = new Usuario();
		usuario.nome  = request.getParameter("nome");
		usuario.user = request.getParameter("user");
		usuario.password = request.getParameter("password");
		//this.dados.add(usuario);

        PrintWriter out = response.getWriter();
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		
		usuario.id = Integer.parseInt(request.getParameter("id"));
		usuario.nome  = request.getParameter("nome");
		usuario.user = request.getParameter("user");
		usuario.password = request.getParameter("password");
		
		Usuario[] userArr;
		userArr = this.dados.toArray(new Usuario[this.dados.size()]);
		Array.set(userArr, usuario.id, usuario);
		
		//response.getWriter().append(strArr[id]);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		this.dados.remove(id);		
		
	}

}
