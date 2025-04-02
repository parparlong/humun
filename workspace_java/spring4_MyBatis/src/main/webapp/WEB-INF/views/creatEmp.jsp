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
					<!-- <form method="put" action="emp"> -->
					<table border="1">
						<!-- 		
			<tr>							
				<th>empno</th>
				<td><input type="text" id="empno"></td>
			</tr> -->
						<tr>
							<th>ename</th>
							<td><input type="text" id="ename"></td>
						</tr>
						<tr>
							<th>sal</th>s
							<td><input type="text" id="sal"></td>
						</tr>
						<tr>
							<th>comm</th>
							<td><input type="text" id="comm"></td>
						</tr>
						<tr>
							<th>hiredate</th>
							<td><input type="date" id="hiredate"></td>
						</tr>
						<tr>
							<th>gmr</th>
							<td><input type="text" id="mgr"></td>
						</tr>

					</table>
					<input type="button" id="join" value="생성하기">

					<!-- </form> -->
					<script>



						document.querySelector("#join").addEventListener("click", function (e) {

							
							const ename = document.querySelector("#ename").value
							const sal = document.querySelector("#sal").value
							const comm = document.querySelector("#comm").value
							const hiredate = document.querySelector("#hiredate").value
							const mgr = document.querySelector("#mgr").value

							let param = {
									ename: ename,
									sal: sal,
									comm: comm,
									hiredate: hiredate
								}

							let param2 = {
									ename: document.querySelector("#ename").value,
									sal: document.querySelector("#sal").value,
									comm: document.querySelector("#comm").value,
									hiredate: document.querySelector("#hiredate").value,
									mgr: document.querySelector("#mgr").value
								}

							//방어코딩이란? 공백/숫자인대 글자가들어갈떄, 3000 == 3,000이랑같을때 또뭐있지?
							//그냥 input='number'로 바꾸는게 더 편하지 않을까
						

							if (ename.trim().length == 0 || !isNaN(ename)) {
								alert('사원이름를 다시 입력하세요')
								document.querySelector("#ename").focus()

							} else if (sal.trim().length == 0 || isNaN(sal)) {
								alert('급여를 다시 입력하세요')
								document.querySelector("#sal").focus()

							} else if (comm.trim().length == 0 || isNaN(comm)) {
								alert('보나스를 다시 입력하세요')
								document.querySelector("#comm").focus()

							} else if (hiredate == "") {
								alert('사원입사일자를 다시 입력하세요')
								document.querySelector("#hiredate").focus()

							} else {
								
								console.log(ename)
								console.log(sal)
								console.log(comm)
								console.log(hiredate)
								console.log(mgr)


								// ajax
								// const xhr = new XMLHttpRequest();
								// xhr.open('post','insertEmp')
								// xhr.setRequestHeader('Content-Type','application/json')
								// xhr.send(JSON.stringify(param))
								// xhr.onload = function(){
								// 	if(xhr.responseText == "1"){
								// 		console.log(xhr.responseText)
								// 		alert('생성 완료')
								// 		location.href = 'empselct'
								// 	}else {
								// 		console.log(xhr.responseText)
								// 		alert('생성 실패')
								// 	}

								fetch('creatEmp', {
									method: 'POST',
									headers: {
										'Content-Type': 'application/json'
									},
									body: JSON.stringify(param2)
								}).then(function (resp) {
									return resp.json()
								}).then((data) => {
									console.log(data)
									if(data == 1){
										alert('생성 완료')
										location.href = 'empselct'
									}else{
										alert('생성 실패')
									}
								}).catch((error) => {
									console.log('ERROR joinEmp fetch', error)
								})




							}
						})

						let a = 10;
						setTimeout(function () {
							a = 20;
						}, 1000)
						console.log(a) // 10이 나옴
						// resolve 해결
						// reject 거부
						// Promise는 resolve()또는 reject()가 실행될때 까지 기다려준다.
						let p = new Promise(function (resolve, reject) {
							setTimeout(function () {
								if (a == 10) {
									a = 20;
									resolve(a) // 성공
								} else {
									reject('실패') // 실패
								}

							}, 1000)
						})
						p.then(function (data) {
							console.log('성공', data)
						})
						p.catch(function (data) {
							console.log('실패', data)
						})
						p.finally(function () {
							console.log('무조건 실행')
						})
						//프로미스만 사용하면 resolve가 실행되고 동기화 처리해야되는 then등을 사용해야됨
						// async await를 사용하면 프로미스가 끝날때까지 기다려 주고 순서대로 실행해준다.
						async function async_await() {
							await new Promise(function (resolve, reject) {
								setTimeout(function () {
									if (a == 10) {
										a = 20;
										resolve(a) // 성공
									} else {
										reject('실패') // 실패
									}
								}, 1000)
							})

							console.log('위에꺼 끝나고 나서 실행됨', a)
						}


					</script>
				</body>

				</html>