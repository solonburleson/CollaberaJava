<%@include file="links.jsp" %>
<% 
	session.invalidate();
	out.print("You are successfully logged out");
%>