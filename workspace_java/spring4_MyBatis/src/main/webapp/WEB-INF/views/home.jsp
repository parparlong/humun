<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
			<!DOCTYPE html>	
			<html>

				<head>
					<title>aaaaa</title>
				</head>
				<style>
					table {
						width: 100vw;
						border-collapse: collapse;
						border: 1px solid black;
					}

					th,
					td {
						border: 1px solid black;
					}
				</style>

				<body>

					<table border="1">
						<thead>
							<tr>
								<th>empno</th>
								<th>ename</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="dto" items="${list}">
								<tr>
									<td>${dto.empno}</td>
									<td>${dto.ename}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>




					<h1>
						Hello world!
						<button type="button" id="btn">버튼</button>
					</h1>
					<table>
						<thead>
							<tr>
								<th>empno</th>
								<th>ename</th>
								<th>job</th>
								<th>mgr</th>
								<th>hiredate</th>
								<th>sal</th>
								<th>comm</th>
								<th>deptno</th>
							</tr>
						</thead>
						<tbody id="up">
						</tbody>


					</table>

				</body>
				<script>
					window.addEventListener('load', function () {
						const btn = document.querySelector("#btn")
						btn.addEventListener('click', function () {
							console.log("click!!")

							const xhr = new XMLHttpRequest()

							xhr.open('get', 'emp')

							xhr.setRequestHeader('Content-Type', 'application/json')
							xhr.send()

							xhr.onload = function () {
								let aa = JSON.parse(xhr.responseText)
								console.log(JSON.stringify(aa));

								// document.querySelector("#up2").innerHTML = JSON.parse(xhr.responseText)
								console.log(JSON.stringify(xhr.responseText))
								console.log(JSON.parse(xhr.responseText))
								for (let i = 0; i < aa.length; i++) {
									ab = document.createElement("tr")
									ab.innerHTML =
										`
								<tr>
									<td>\${aa[i].empno}</td>
									<td>\${aa[i].ename}</td>
									<td>\${aa[i].job}</td>
									<td>\${aa[i].mgr}</td>
									<td>\${aa[i].hiredate}</td>
									<td>\${aa[i].sal}</td>
									<td>\${aa[i].comm}</td>
									<td>\${aa[i].deptno}</td>
								</tr>
							`
									let up = document.querySelector("#up")
									up.append(ab)
								}
							}

						})
					})
				</script>

				</html>