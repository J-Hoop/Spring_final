<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<c:import url="/resources/css/mainPage_css.jsp"></c:import>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	setInterval("gettime(), 1000");
	function gettime() {
		var now = new Date();
		hours = now.getHours();
		minutes = now.getMinutes();
		seconds = now.getSeconds();
		
		if(hours > 12){
			hours -= 12;
			ampm = "오후";
		}else{
			ampm = "오전";
		}
		if(hours < 10){
			hours = "0" + hours;
		}
		if(minutes < 10){
			minutes = "0" + minutes;
		}
		if(seconds < 10){
			seconds = "0" + seconds;
		}
		document.getElementById("gettime").innerHTML = ampm+hours + ":" + minutes + ":" + seconds;
	}
	
	
</script>
<style type="text/css">
#frm div{
	width: 120%;
    height: 2vh;
    display: inline-block;
}
</style>
</head>
<body>
	<c:import url="../headerPage.jsp"></c:import>
	<section id="mainPage_base">
		<div id="mainPage_menu_front">
			<div id="mainPage_front_time">
				<span id="gettime">00:00:00</span>
			</div>
			<form action="projectInsert" method="post" id="frm">
				
				<p>프로젝트타이틀: <input type="text" name="p_title"></p>
				<p>프로젝트예산: <input type="number" name="p_budget"></p>
				<p>프로젝트시작일: <input type="date" name="p_start"></p>
				<p>프로젝트완료일: <input type="date" name="p_last"></p>
				<p>프로젝트내용 : <input type="text" name="p_contents"></p>
				<p>프로젝트부서 : <input type="text" name="dept_name"></p>
				<p>프로젝트직책 : <input type="text" name="emp_grade"></p>
				<p>프로젝트팀장 : <input type="text" name="emp_name"></p>
				<p>프로젝트팀장사번:<input type="text" name="emp_num"></p>
				<div class="test"></div>
				<p>프로젝트진행률: <input type="text" name="p_dday" ></p>
				
			<input type="submit" id="insert" value="프로젝트생성">
			</form>
			<input type="button" id="btn" value="프로젝트인원">
			<input type="button" id="btn2" value="프로젝트인원추가">
		</div>
		<div id="main_menu_select">
			<hr>
			<a href="mainPage">홈</a>
			<hr>
			<a href="./projectList">프로젝트페이지</a>
			<hr>
			<a href="productPage">물량관리</a>
			<hr>
			<a href="salPage">월급관리</a>
			<hr>
			<a href="meetingRoomPage">회의실예약관리</a>
			<hr>
			<a href="humanPage">인사관리</a>
			<hr>
			<a href="notice">공지사항</a>
			<hr>
			
		</div>
	</section>
	

</body>

<script type="text/javascript">
function empList() {
	userwidth = (screen.width - 0);
	userheight = (screen.height - 0);
	window.open("./projectEmpList","empList");
}
	$("#btn").click(function(){
		empList();
	});
	
	var count = 0;
	$("#btn2").click(function() {
		$(".test").append("팀원:<div id='emp_name_team"+count+"'></div><input type='hidden' id='emp_num"+count+"' name='emp_num'>");
		count++;
	});
	
	

</script>
</html>