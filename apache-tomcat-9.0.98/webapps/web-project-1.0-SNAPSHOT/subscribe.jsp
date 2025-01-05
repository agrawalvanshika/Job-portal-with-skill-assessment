<%@ page import="java.util.regex.*"%>
<%
  String email = request.getParameter("email");
  String emailRegex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";

  if (email != null && Pattern.matches(emailRegex, email)) {
    out.println("<h1>Thank you for subscribing with: " + email + "</h1>");
  } else {
    out.println("<h1>Invalid email address. Please try again.</h1>");
  }
%>
