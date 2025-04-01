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
							</tr>
						</thead>
						<tbody>
							<c:if test="${not empty list}">
								<c:forEach var="dto" items="${list}" varStatus="loop">
									<tr>
										<td>${loop.count}</td>
										<td>${dto.empno}</td>
										<td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${empty list}">
								<tr>
									<td colspan=3>조회 내용이 없습니다</td>
								</tr>
							</c:if>
							<a href="creatEmp"><button type="button">생성</button></a>
							<a href="delete"><button type="button">삭제</button></a>
						</tbody>
					</table>
					<button type="button" id="btn">진동</button>
					<div id="view"></div>
					
					<style>
						* {
							font-size: 30px;
						}

						#popup {
							border: 1px solid red;
							width: 300px;
							height: 300px;
							position: absolute;
							top: 50px;
							left: 300px;
							box-shadow: 0 10px 500px 0 rgba(0, 0, 0, 0, 4);
						}

						#popup .title {
							background: blue;
							color: white;
						}

						#popup .content {
							background: white;

						}

						#dim {
							width: 100vw;
							height: 100vh;
							background-color: rgba(172, 172, 172, 0.5);
							position: absolute;
							top: 0;
							left: 0;
							/* backdrop-filter: blur(5px); */
						}
						
					</style>
					<div id="dim">
						<div id="popup">
							<div class='title'>
								제목
							</div>
							<div class="content">
								내용<br>
								내용
							</div>
						</div>
					</div>
					<script>
						if (screen.orientation) {
							screen.orientation.addEventListener('change', () => {
								document.querySelector("#view").innerHTML = `
							type: \${screen.orientation.type}<br>
							angle: \${screen.orientation.type}
							orientation: \${window.orientation}
							`
							})
						} else {
							alert('방향 지원 안함')
						}
						// 타이틀에서 왼쪽 버튼을 누르면 
						// 왼쪽 버튼이 눌렸다는걸 저장
						// 타이틀에서 왼쪽 버튼을 떼면
						// 왼쪽 버튼이 떨어졌다는 걸 저장
						
						// 마우스 최초 눌렀을때 
						// 그때 마우스 위치 값 저장
						let isDragable = false
						let offsetX=0;
						let offsertY=0;
						document.querySelector(".title").addEventListener("mousedown", function (e) {
							isDragable = true;
							document.querySelector("#view").innerHTML = `
							x:\${e.clientX}<br>
							x:\${e.clientY}<br>
							`
							offsetX = e.clientX 
							offsetY = e.clientY 
						})

						document.querySelector(".title").addEventListener("mouseup", function (e) {
							isDragable = false
						})
						document.querySelector(".title").addEventListener("mousemove", function (e) {
							if(isDragable){
								let diffX = e.clientX - offsetX
								let diffY = e.clientY - offsetY

								let popup = document.querySelector("#popup");

								// console.log(document.querySelector("#popup").style.top)
								console.log(popup.offsetTOP)
								
								popup.style.top = (popup.offsetTop + diffY)+'px'
								popup.style.left = (popup.offsetLeft + diffX)+'px'

								offsetX = e.clientX
								offsetY = e.clientY
							}
						})


						document.querySelector("#btn").addEventListener("click", function (e) {
							navigator.vibrate(2000); // 2초 진동
						})
					</script>

				</body>

				</html>