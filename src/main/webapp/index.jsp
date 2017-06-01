<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="edu.co.sergio.mundo.vo.*"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
    background-image:
        url('http://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crunchify JSP Servlet Example</title>
</head>
<body>
 
    <%
       if( request.getAttribute("obras")!=null){
          List<Recoleccion> obras  = (List<Recoleccion>)request.getAttribute("obras");
           for (Recoleccion obra : obras) {
         %>      
         <h1> <%=obra.getNombreAutor()%> </h1><br/> 
         <%      
          }
       }
      
    
    %>
    <img src="ChartServlet" />
</body>
</html>
