<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="kr.or.human.dto.*" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
				<!DOCTYPE html>
				<html>

				<head>
					<meta charset="UTF-8">
					<title>emp</title>
				</head>


				<body>
					<header>
						Logo
						<nav>
							Emp관리 > 회원 목록
						</nav>
					</header>
					<main>

					</main>




					<a href="creatEmp"><button type="button">생성</button></a>
					<a href="delete"><button type="button">삭제</button></a>
				
					<select id="type">
						<option value="empno" selected>empno </option>
						<option value="ename">ename </option>
						<option value="sal">sal(이상)</option>
						<option value="ej">ename+job</option>
					</select>
					<input type="text" id="serch" placeholder="검색어를 입력하세요" value="${dto.ename}">
					<button type="button" id="searchclick">검색</button>
					<table border="1">
						<thead>
							<tr>
								<th>선택</th>
								<th>empno</th>
								<th>ename</th>
								<th>sal</th>
								<th>job</th>
							</tr>
						</thead>
						<form method="post" action="selectname">
							<tbody id="tbody">
								<c:if test="${not empty list}">
									<c:forEach var="dto" items="${list}" varStatus="loop">
										<tr>
											<td>
												<input type="checkbox" class="empnos" value="${dto.empno}">
											</td>
											<td id="newnmpno">${dto.empno}</td>
											<td><a href="detailEmp?empno=${dto.empno}" id="newename">${dto.ename}</a>
											</td>
											<td>${dto.sal}</td>
											<td>${dto.job}</td>
										</tr>
									</c:forEach>
								</c:if>
								<c:if test="${empty list}">
									<tr>
										<td colspan=3>조회 내용이 없습니다</td>
									</tr>
								</c:if>
							</tbody>
							<button type="submit" id="pickdel">선택된것만 산제</button>
						</form>
					</table>
					<div>
						<%
						//model에 담은건 request에서 꺼낼 수 있다.
						 Map map = (map)request.getAttribute("map");
						 EmpDTO dto = (EmpDTO)request.getAttribute("dto");

						 int total = (Integer)map.get("count");
						 int pageNo = dto.getPage();
						 int viewCount = dto.getViewCount();
						 
						 //1401 / 10 = 140.1 올림해서 141
						 	int lastPage = (int)Math.ceil((double)total / viewCount);

							int groupCount = 5; // 한번에 보여줄 페이지 계수 
							int groupPosition = (int)Math.ceil((double)pageNo / groupCount);
							int begin = ((groupPosition-1) * groupCount + 1); // 1, 6, 11, 16
							int end = groupPosition * groupCount; // 5, 10, 15, 20
							if (end > lastPage) {
								end = (int)lastPage;
							}

						%>
						[이전]
						<c:forEach  var="i" begin="<%= begin %>" end="<%= end %>">
						<c:if test="${i == dto.page}">	
						<c:set var="clazz" value="bold"/>	
						</c:if>
						<a href="empselect?page=${i}">${i}</a>

							<a href="empselct?page=${i}"><strong>${i}</strong></a>
						
						</c:forEach>
						[다음]	
						<a href="empselect?page=1">1</a>
						<a href="empselect?page=2"><strong>2</strong></a>
						<a href="empselect?page=3">3</a>
					</div>

				</body>
				<script>
					window.addEventListener("load", function () {


						document.querySelector("#type").addEventListener("change", function () {
							thisvalue = this.value
							console.log(thisvalue)
						})
						document.querySelector("#searchclick").addEventListener("click", function () {

							// let newnmpno = document.querySelector("#newnmpno").innerHTML
							// let newename = document.querySelector("#newename").innerHTML
							let tbody = document.querySelector("#tbody")

							// 셀렉트박스 교체이벤트



							fetch('selectname?type=' + document.querySelector("#type").value
								+ '&	stringvalue=' + document.querySelector("#serch").value

								, {
									method: 'GET'
								}).then(function (resp) {
									console.log(resp)

									resp[0]
									return resp.json()
								}).then((data) => {
									console.log(data)

									tbody.innerHTML = ``
									let a = 0;
									for (let i = 0; i < data.length; i++) {
										a++
										tbody.innerHTML += `
									
									<tr>
										<td>\${data[i].empno}</td>
										<td>\${data[i].ename}</td>
										<td>\${data[i].sal}</td>
										<td>\${data[i].job}</td>
										</tr>
										
										
										`
									}
									if (data) {
										alert('조회 완료')
									} else {
										alert('조회 실패')
									}
								}).catch((error) => {
									console.log('ERROR joinEmp fetch', error)
								})

						})

					})
				</script>

				</html>