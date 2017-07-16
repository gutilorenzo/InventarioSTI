package Controles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.ingresoInv;

/**
 * Servlet implementation class cIngreso
 */
@WebServlet("/cIngreso")
public class cIngreso extends HttpServlet {
	ingresoInv ingInv = new ingresoInv();
	private static final long serialVersionUID = 1L;
       
    
    public cIngreso() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		String titulo = "Salida de un simple Servelet";
		//Declaramos el tipo de contenido
		response.setContentType("text/html");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println(titulo);
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println(titulo);
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ingInv.setNombreProducto(request.getParameter("Productos"));
		ingInv.setCantidad(request.getParameter("Cantidad"));
		ingInv.setProveedor(request.getParameter("Proveedor"));
		ingInv.setFecha(request.getParameter("Fecha"));
		
		ingInv.darIngreso(ingInv);
		
		response.sendRedirect("ingresoInv.jsp");
		System.out.println(ingInv.getNombreProducto());
		
		
		
		//doGet(request, response);
	}

}
