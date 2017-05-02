<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	body{
	font-size: 12px;
	}
	.row{
	width: 90%;
	font-size: 16px;
	}
	
	.row > div{
		box-sizing : border-box;
		float : left;
		min-height:100px;
		background: pink;
		
		font-size: 1em;
	}

</style>
</head>
<body>
	<h1>로그인${validate}</h1>
	<div class ="row col-left col-right">
	
		<div class="col-xs-2 col-sm-2" style="padding: 10px">동해물과 백두산이 마르고 닳도록</div>
		<div class="col-xs-2 col-sm-2 col-xs-margin">동해물과 백두산이 마르고 닳도록</div>
		<div class="col-xs-2 col-sm-2 col-sm-margin">동해물과 백두산이 마르고 닳도록</div>
		<div class="col-xs-2 col-sm-2 col-xs-margin">동해물과 백두산이 마르고 닳도록</div>
	</div>
	<form action="${root}/j_spring_security_check" method="post">
		<fieldset>
			<table>
				<c:if test="${not empty validate && not validate}">
				<tr>
					<td colspan="2" style="color:red;">아이디 도는 비번이 유효하지 않습니다.</td>
				</tr>
				</c:if>
				<tr>
					<th>아이디 :</th>
					<td><input name="j_username" type="text" /></td>
				</tr>
				<tr>
					<th>비밀번호 :</th>
					<td><input name="j_password" type="password" /></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="로그인" />
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>