package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlumnoDAO;
import dao.AlumnoDaoImp;
import entity.Alumno;

/**
 * Servlet implementation class MostrarAlumnos
 */
@WebServlet("/MostrarAlumnos")
public class MostrarAlumnos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarAlumnos() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AlumnoDAO misGestor = new AlumnoDaoImp();
		
		try {
			int	dni_borrar = Integer.parseInt(request.getParameter("alumno_dni"));
				int devolvio= misGestor.borrarAlumno(dni_borrar);
				
				if(devolvio> 0){
					
				request.setAttribute("borrado", "Alumno Borrado");
				
				}else{
					
					request.setAttribute("borrado", "");
					
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Alumno> misAlumnitos = misGestor.getAlumnos();
		
		request.setAttribute("alumnos", misAlumnitos);

		getServletContext().getRequestDispatcher("/WEB-INF/jsps/alumnos_lista.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
