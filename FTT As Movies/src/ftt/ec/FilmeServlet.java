package ftt.ec;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Movie
 */
@WebServlet("/MovieAPI")
public class FilmeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ArrayList<Filme> dados = new ArrayList<Filme>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmeServlet() {
        super();
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
		Filme filme = this.dados.get(id);
		
		response.getWriter().append("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        Filme filme = new Filme();
        filme.titulo  = request.getParameter("titulo");
        filme.sinopse = request.getParameter("sinopse");
        filme.duracao = Integer.parseInt(request.getParameter("duracao"));
		this.dados.add(filme);

        PrintWriter out = response.getWriter();
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Filme filme = new Filme();
		
		filme.id = Integer.parseInt(request.getParameter("id"));
		filme.titulo = request.getParameter("titulo");
		filme.sinopse = request.getParameter("sinopse");
		filme.duracao = Integer.parseInt(request.getParameter("duracao"));
		
		Filme[] filmeArr;
		filmeArr = this.dados.toArray(new Filme[this.dados.size()]);
		Array.set(filmeArr, filme.id, filme);
		
		//response.getWriter().append(filmeArr[id]);
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

