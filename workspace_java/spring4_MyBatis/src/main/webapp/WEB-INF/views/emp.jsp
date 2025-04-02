<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
					<input type="text" id="serch" placeholder="검색어를 입력하세요" value="${dto.ename}">
					<button type="button" id="searchclick">검색</button>
					<table border="1">
						<thead>
							<tr>
								<th>count</th>
								<th>empno</th>
								<th>ename</th>
							</tr>
						</thead>
						<tbody id="tbody">
							<c:if test="${not empty list}">
								<c:forEach var="dto" items="${list}" varStatus="loop">
									<tr>
										<td>${loop.count}</td>
										<td id="newnmpno">${dto.empno}</td>
										<td><a href="detailEmp?empno=${dto.empno}" id="newename">${dto.ename}</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${empty list}">
								<tr>
									<td colspan=3>조회 내용이 없습니다</td>
								</tr>
							</c:if>
						</tbody>
					</table>


				</body>
				<script>
					document.querySelector("#searchclick").addEventListener("click", function () {
						
						// let newnmpno = document.querySelector("#newnmpno").innerHTML
						// let newename = document.querySelector("#newename").innerHTML
						let tbody = document.querySelector("#tbody")
						fetch('selectname?ename='+document.querySelector("#serch").value, {
							method: 'GET'
						}).then(function (resp) {
							console.log(resp)
							
							resp[0]
							return resp.json()
						}).then((data) => {
							console.log(data)
						
							tbody.innerHTML = ``
							let a=0;
							for (let i = 0; i < data.length; i++) {
								a++
								tbody.innerHTML += `
								
									<tr>
									<td>\${a}</td>
									<td>\${data[i].empno}</td>
									<td>\${data[i].ename}</td>
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

				</script>

				</html>