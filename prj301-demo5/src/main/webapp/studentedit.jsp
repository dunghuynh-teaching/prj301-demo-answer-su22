<%-- 
    Document   : studentlist
    Created on : 16/06/2022, 1:26:34 AM
    Author     : DUNGHUYNH
--%>

<%@page import="com.fptuni.prj301.demo.Student.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>
        
         <h1>Student Edit </h1>

         <jsp:include page="/menu.html" flush="true" />
         
         <p>Login user: ${sessionScope.usersession.username}</p>
         
         <form action="student" method="POST">
         <table>
         
        <tr><td>Id</td><td><input name="id" value="${requestScope.object.id}" type="text" ></td></tr>
        <tr><td>First name</td><td><input name="firstname" value="${requestScope.object.firstName}" type="text"}</td></tr>
        <tr><td>Last name</td><td><input name="lastname" value="${requestScope.object.lastName}" type="text"></td></tr>		 
                      
        </table>
        <input name="action" value="${requestScope.action}" type="hidden">
        <input value=Save type="Submit">
    </form>
    </body>
</html>
