<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<c:import url="/resources/css/mainPage_css.jsp"></c:import>
	<c:import url="/resources/css/projectList_css.jsp"></c:import>
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
</head>
<body>
	<c:import url="../headerPage.jsp"></c:import>
	<section id="mainPage_base">
		<div id="mainPage_menu_front">
			<div id="mainPage_front_time">
				<span id="gettime">00:00:00</span>
			</div>
			<form action="projectList">
				<table id="projectList_form">
					<tr>
						<td>프로젝트넘버</td>
						<td>프로젝트타이틀</td>
						<td>프로젝트컨텐츠</td>
						<td>프로젝트예산</td>
						<td>프로젝트시작일</td>
						<td>프로젝트완료일</td>
						<td>프로젝트부서</td>
						<td>프로젝트팀장</td>
						<td>프로젝트직책</td>
						<td>프로젝트진행상황</td>
					</tr>
					<c:forEach items="${projectList}" var="dto">
						<tr>
							<td>${dto.p_num}</td>
							<td>${dto.p_title}</td>
							<td>${dto.p_contents}</td>
							<td>${dto.p_budget}</td>
							<td>${dto.p_start}</td>
							<td>${dto.p_last}</td>
							<td>${dto.dept_name}</td>
							<td>${dto.emp_name}</td>
							<td>${dto.emp_grade}</td>
							<td>${dto.p_dday}</td>
							
						</tr>
					</c:forEach>
										
							
					
					
				</table>
			<a href="./projectInsert">프로젝트 생성</a>	
			</form>
		</div>
		<div id="main_menu_select">
			<hr>
			<a href="../mainPage">홈</a>
			<hr>
			<a href="./projectList">프로젝트페이지</a>
			<hr>
			<a href="#">물량관리</a>
			<hr>
			<a href="#">월급관리</a>
			<hr>
			<a href="#">회의실예약관리</a>
			<hr>
			<a href="#">인사관리</a>
			<hr>
			<a href="#">공지사항</a>
			<hr>
			
		</div>
	</section>
	

</body>
</html>