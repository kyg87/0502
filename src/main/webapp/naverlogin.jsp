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
		//client_id �� redirect_uri ���

		var naver_id_login = new naver_id_login("CpY0lAbqsJbBGpv9R49D",	"http://127.0.0.1:8080/MavenPrj/callback.jsp");

		/* ��� �����ѹ�ư Option

		��ư ���� : white, green

		ũ�� : 1(��ư��), 2(���� ���), 3(ū ���)

		��� �� ��ư ���� : ����� ������ */

		naver_id_login.setButton("white", 2, 40);

		naver_id_login.setDomain(".service.com");

		naver_id_login.setState("abcdefghijkmnopqrst");

		//�α��� popup ���·� ����

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
	<!-- ��ư�� �� ��ġ ����-->



</body>

</html>