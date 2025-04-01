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
					<table border="1">
						<thead>
							<tr>
								<th>count</th>
								<th>empno</th>
								<th>ename</th>
								<th>삭제</th>
							</tr>
						</thead> 
						<tbody>
						<c:if test="${not empty list}">
							<c:forEach var="dto" items="${list}" varStatus="loop">
								<tr>
									<td>${loop.count}</td>									
									<td id="empno">${dto.empno}</td>
									<td>${dto.ename}</td>
									<td><button type="button" class="del">삭제</button></td>
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
					let dels =  document.querySelectorAll(".del")
					for(let i = 0; i<dels.length; i++){
						dels[i].addEventListener("click",function(e){

						console.log(e.target.parentNode.parentNode)
					
						e.preventDefault();
					
						const empno = e.target.parentNode.parentNode.querySelector("#empno").innerText
						
						let param = {
								empno : empno
						}

						// ajax
						const xhr = new XMLHttpRequest();
						xhr.open('delete','deleteEmp')
						xhr.setRequestHeader('Content-Type','application/json')
						xhr.send(JSON.stringify(param))
						xhr.onload = function(){
							if(xhr.responseText == "1"){
								console.log(xhr.responseText)
								alert('삭제 완료')
								location.href = 'empselct'
							}else {
								console.log(xhr.responseText)
								alert('삭제 실패')
							}
						}
						})
					}
					
				</script>

				</html>