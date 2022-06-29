<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
        <title>PRJ301 Demo - Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
</head>
    <body>
        <h1>Please login</h1>
        <img src="images/header.jpg" width="200">
        <form action="./login" name="" method="POST">
            <input name="user" type="text">
            <% 
             for ( int i = 0; i<10; i++){
                //command
            }%>
            
            <input name="password" type="password">
            <input value="Login" type="submit">
        </form>
        <%! String a = "Dung"; %>
        <% System.out.println(new Date()); %>
        <%! String keyword; %>
        <% keyword =  request.getParameter("keyword"); %>
        
        
        
        <!--  -->
        
    </body>
</html>
