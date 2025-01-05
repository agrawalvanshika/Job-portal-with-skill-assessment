<%@ page import="java.util.*"%>
<%
  String jobTitle = request.getParameter("jobTitle");
  String location = request.getParameter("location");

  out.println("<h1>Search Results for " + jobTitle + " in " + location + "</h1>");
%>
