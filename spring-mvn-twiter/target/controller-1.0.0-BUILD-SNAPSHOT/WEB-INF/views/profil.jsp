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
}
</style>
</head>
<body>

	<ul>
		<li><a class="active" href="/controller/profil">Home</a></li>
		<li><a class="active" href="/controller/friends">Friends</a></li>
		<li><a href="#about">About</a></li>
	</ul>
	<div class="padding_container">Hello, Raluca Plugariu!</div>
	<br></br>
		<div class="padding">Write a post here</div>
		<sf:form method="POST" modelAttribute="postMessage" action="profil">
		
	<div class="wrapper">
		<sf:input path="content"
			style="width: 150px;" name="post" id="post"
			value=""/>
		<input type="submit" value="Post" />
	</div>
	</sf:form>
<br></br>
<br></br>
	<div class="mess">Your friends posts</div>
	<br></br>
	
	<div class="mess-list">
		<c:forEach var="messagesList" items="${messages}">

			<span class="bold_font"><c:out value="${messagesList.content}" /></span>
			<!-- using the relative path in the URL -->
			<br></br>
		</c:forEach>
	</div>
	<br><br></br></br>
		<div class="mess">Your posts</div>
	<div class="user-mess-list">
		<c:forEach var="userMess" items="${userMessage}">

			<span class="bold_font"><c:out value="${userMess.content}" /></span>
			<!-- using the relative path in the URL -->
			<br></br>
		</c:forEach>
	</div>
	

</body>
</html>