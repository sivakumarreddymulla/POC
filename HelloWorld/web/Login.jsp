<%-- 
    Document   : Login
    Created on : Feb 14, 2019, 1:25:38 PM
    Author     : sivavutla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   String userName = request.getParameter("UserName");
   String password = request.getParameter("Password");
   if(userName.equals("Devopsuser")  && password.equals("password")){
       response.sendRedirect("Home.html");
   }
   else{
       response.sendRedirect("invalid.html");
   }
    %>


