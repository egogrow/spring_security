<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메인 페이지</title>
</head>
<body>
환영합니다 : <strong>${user}</strong>, 메인 페이지입니다.<br/>

<security:authorize access="hasRole('ADMIN')">
	<strong>ADMIN 권한을 가진 사람이 볼 수 있는 컨텐츠</strong><br/>
</security:authorize>

<security:authorize access="hasRole('DBA')">
	<strong>DBA 권한을 가진 사람이 볼 수 있는 컨텐츠</strong><br/>
</security:authorize>

<security:authorize access="hasRole('ADMIN') and hasRole('DBA')">
	<strong>ADMIN 및 DBA 권한을 가진 사람이 동시에 볼 수 있는 컨텐츠</strong><br/>
</security:authorize>

<security:authorize access="hasRole('USER')">
	<strong>USER 권한을 가진 사람이 볼 수 있는 컨텐츠</strong><br/>
</security:authorize>
<a href="<c:url value="/logout" />">Logout</a>

</body>
</html>