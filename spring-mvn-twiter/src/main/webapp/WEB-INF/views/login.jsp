<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>

<sf:form method="POST" modelAttribute="account" action="/controller/login">

	<div style="margin-top: 200px; margin-bottom: 10px;">
		<span
			style="width: 500px; color: blue; font-size: 30px; font-weight: bold; border-bottom: 1px solid blue;">Login</span>
	</div>
	<div style="margin-bottom: 5px;">

		<span style="width: 100px;">Name</span>
		<sf:input path="username" style="width:150px;" type="text" name="name"
			id="name" />

	</div>
	<div>
		<span style="width: 100px;">password</span>
		<sf:input path="password"
			style="width: 150px;" type="password" name="password" id="password"
			value=""/>


		<input type="submit" value="Login" />
	</div>
</sf:form>
</html>
