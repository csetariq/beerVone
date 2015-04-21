<%@ page import="java.util.*" %>

<html>
<body>
	<h1 align="center">Beer Recommendation JSP</h1>
	<p>

	<%
		List<String> styles = (List) request.getAttribute("styles");
		for (String style : styles)
			out.println("<br>try " + style);
	%>
</body>
</html>

