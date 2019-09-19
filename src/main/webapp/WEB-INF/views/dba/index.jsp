<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DBA 페이지</title>
</head>
<body>
환영합니다 : <strong>${user}</strong>,  DBA 페이지에 오신 것을 환영합니다.<br/>
<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>