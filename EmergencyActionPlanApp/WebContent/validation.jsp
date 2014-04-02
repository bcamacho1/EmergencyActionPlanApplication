
<html>
	<head>
   		<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
   		<title>Login Validation</title>
	</head>
	<body bgcolor="lightblue"><font size=4>
    	<center><h1>Validating data</h1></center>
   		<form method=post action="menuMemeber.jsp">	<hr><br> <center>
   			<jsp:useBean id="member" class="ndnu.ws.StaffMember" scope="session"/>
   			<jsp:setProperty name="member" property="*" />
   			<jsp:useBean id="login" class="ndnu.ws.LoginServiceImplem" scope="session"/>
   			<% boolean v = login.login(member.getEmailAddress(), member.getPassword()); %>
	   		<% if(v) {%>
	   				Your email: <% member.getEmailAddress();%> or password <%member.getPassword();%> is correct.
	   				<LI><A HREF="menuMember.jsp"> Go to menu </A></LI> <p>
	  		<%} else {%> 
	    			Your email: <%member.getEmailAddress();%> or password <%member.getPassword();%> is incorrect.
	    			<LI><A HREF="index.jsp"> Go to login </A></LI> <p>
	  		<%}%>  </center>
 
  			<br><hr>
  		</form> </font>  
	</body>
	<img src="<%=request.getContextPath()%>/images/ndnuLogo.jpg"/>	
</html>