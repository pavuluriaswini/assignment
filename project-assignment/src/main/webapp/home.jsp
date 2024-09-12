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
</body>
</html>