# assignment

1. Open IDE Cerate a dynamic web project
2. Under src/main/java create class Login servlet.This is the logic to display the login page. Here in login servlet we have give password and username and when we run home page if we click on the login the password and username fill by default


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
3. Create JSPs for different web pages as home.jsp, Login.jsp 
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Home Page</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            text-align: center;
            background-color: #e1aadd;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(68, 5, 5, 0.1);
        }

        h1 {
            color: #ebee08;
            font-size: 2.5em;
            margin-bottom: 20px;
        }

        p {
            font-size: 1.2em;
            color: #555;
        }

        a {
            text-decoration: none;
            color: white;
            background-color: #6c96c3;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 1em;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Course Dashboard</h1>
        <p><a href="login.jsp">Go to Login Page</a></p>
    </div>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style> 
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
            width: 400px;
            padding: 20px;
            border: 2px solid #daa6a6;
            border-radius: 10px;
            background-color: #f4e5e5;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 2px solid #9d6b6b;
            border-radius: 5px;
            font-size: 16px;
        }
        input[type="submit"] {
            padding: 12px;
            background-color: rgb(63, 175, 213);
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: rgb(48, 140, 170);
        }
        .error-message {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <form action="LoginServlet" method="post">
        <h2>Login</h2>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        
        <input type="submit" value="Login">
        
        <c:if test="${not empty errorMessage}">
            <p class="error-message">${errorMessage}</p>
        </c:if>
    </form>
</body>
</html>
</body>
</html>


4. Now run hpme .jsp or navigate to Navigate to http://localhost:8080/project-assignment(your-projectname)/home.jsp
 we redirect to our home page
