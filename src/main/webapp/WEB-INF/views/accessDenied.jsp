<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>엑세스 거부 페이지</title>
</head>
<body>
<strong>${user}</strong>, 
You are not authorized to access this page.<br/>
<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>