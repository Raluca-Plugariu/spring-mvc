<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111; . wrapper { border : 1px solid #000;
	display: inline-block;
}

input, button {
	background-color: transparent;
	border: 0;
}
.btn {
	width: 150px;
	text-align: center;
	font-size: 15px;
	padding: 5px !important;
	background-color: #6DB33F;
	border: 0px !important;
	color: white;
	text-decoration: none;
	display: inline-block !important;
	vertical-align: top !important;
	font-size: 16px;
	font-family: 'Raleway', sans-serif !important;
	border: solid 0px #707070!important;
}
.fct_btn {
	color: #6DB33F;
	font-size: 16px;
	margin-left: 10px;
}

}
</style>
</head>
<body>

	<ul>
		<li><a class="active" href="/controller/profil">Home</a></li>
		<li><a class="active" href="/controller/friends">Friends</a></li>
		<li><a href="#about">About</a></li>
	</ul>
	<br></br>
	<div class="mess">All users</div>
	<br></br>
	
	<div class="user-list">
		<c:forEach var="userList" items="${users}">

			<span class="bold_font"><c:out value="${userList.username}" /></span>
			<a class= "fct_btn" href="friends/${userList.username}">Follow</a><br />
			<!-- using the relative path in the URL -->
			<br></br>
		</c:forEach>
	</div>
	<br></br>
	<sf:form method="POST" modelAttribute="follow" action="/friends">
		
	<div class="mess">Your friends</div>
	<br></br>
	
	<div class="user-list">
		<c:forEach var="friendList" items="${friend}">

			<span class="bold_font"><c:out value="${friendList.username}" /></span>
			<!-- using the relative path in the URL -->
			<br></br>
		</c:forEach>
	</div>
	</sf:form>
	
	</body>
	</html>
	