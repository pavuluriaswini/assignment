import java.io.IOException;
import jarakata.servlet.RequestDispatcher;
import jarakata.servlet.ServletException;
import jarakata.servlet.annotation.WebServlet;
import jarakata.servlet.http.HttpServlet;
import jarakata.servlet.http.HttpServletRequest;
import jarakata.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")  // URL pattern to map the servlet
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Hardcoded credentials (for demo purposes)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple validation against hardcoded credentials
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            
            response.sendRedirect("dashboard.jsp");
        } else {
            
            request.setAttribute("errorMessage", "Invalid username or password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  
    }
}
