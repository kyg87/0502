<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="EUC-KR">

<title>Insert title here</title>

<link rel="stylesheet" href="css/1.css" type="text/css">

<script src="http://code.jquery.com/jquery-1.7.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js"></script>
<script type="text/javascript"	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js"></script>
<script type="text/javascript" src="jquery.cookie.js"></script>

</head>

<body>

	<div id="naver_id_login"></div>

	<script type="text/javascript">
		//client_id 와 redirect_uri 등록

		var naver_id_login = new naver_id_login("CpY0lAbqsJbBGpv9R49D",	"http://127.0.0.1:8080/MavenPrj/callback.jsp");

		/* 사용 가능한버튼 Option

		버튼 색상 : white, green

		크기 : 1(버튼형), 2(작은 배너), 3(큰 배너)

		배너 및 버튼 높이 : 사용자 지정값 */

		naver_id_login.setButton("white", 2, 40);

		naver_id_login.setDomain(".service.com");

		naver_id_login.setState("abcdefghijkmnopqrst");

		//로그인 popup 형태로 설정

		naver_id_login.setPopup();

		naver_id_login.init_naver_id_login();

		function testcallback()

		{

			alert(naver_id_login.getProfileData('email'));

			alert(naver_id_login.getProfileData('name'));

			alert(naver_id_login.getProfileData('age'));

		}

		naver_id_login.get_naver_userprofile("testcallback()");
	</script>



	<div id="naver_id_login"></div>
	<!-- 버튼이 들어갈 위치 선언-->



</body>

</html>