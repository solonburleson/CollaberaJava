<%@include file="links.jsp" %>
<%
	String name = (String) session.getAttribute("name");
	if(name != null) {
		out.print("<b>Welcome to Profile</b>");
		out.print("<br>Welcome, " + name);
	} else {
		out.print("<span style='color: red;'>Please login first</span>");
		out.flush();
		request.getRequestDispatcher("login.jsp").include(request, response);
	}
%>