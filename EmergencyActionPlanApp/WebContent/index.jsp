	
<html>
	<head>
 		<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
 		<title>Welcome in the Web-based Emergency Action Plan Application</title>
	</head>
	<body bgcolor="lightblue"><font size=4>
  	<center><h1>Welcome in the Web-based Emergency Action Plan Application</h1></center>
	<form method=get action="validation.jsp">	<hr><br> <center>
		<b>LOGIN</b><p>
		Email:   <input type=text name="emailAddress" value="" size = "30" > <p>
		Password: <input type=text name="password" value="" size = "30" > <p>
		<input type=submit value="Submit"> </center>
		<br><hr>
	</form></font>
	</body>
	<img src="<%=request.getContextPath()%>/images/ndnuLogo.jpg"/>
</html>