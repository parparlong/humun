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
			<tr>							
				<th>empno</th>
				<td>${dto.empno}</td>
			</tr>
			<tr>							
				<th>ename</th>
				<td><input type="text" value="${dto.ename}" id="ename"></td>
			</tr>
			<tr>							
				<th>sal</th>
				<td><input type="text" value="${dto.sal}" id="sal"></td>
			</tr>
			<tr>							
				<th>comm</th>
				<td><input type="text" value="${dto.comm}" id="comm"></td>
			</tr>
			<tr>							
				<th>hiredate</th>
				<td><input type="date" value="${dto.hiredate}" id="hiredate"></td>
			</tr>
	</table>
	<input type="hidden" name="empno" value="${dto.empno}">
	<input type="button" id="modify" value="수정하기">

<!-- </form> -->
<script>
	document.querySelector("#modify").addEventListener("click",function(e){
		const ename = document.querySelector("#ename").value
		const sal = document.querySelector("#sal").value
		const comm = document.querySelector("#comm").value
		const hiredate = document.querySelector("#hiredate").value
		const aa = "1";
		e.preventDefault();
		console.log(ename)
		console.log(sal)
		console.log(comm)
		console.log(hiredate)
		
		let param = {
				empno : '${dto.empno}',
				ename : ename,
				sal : sal,
				comm : comm,
				hiredate : hiredate
		}
		
		// ajax
		const xhr = new XMLHttpRequest();
		xhr.open('put','updateEmp')
		xhr.setRequestHeader('Content-Type','application/json')
		xhr.send(JSON.stringify(param))
		xhr.onload = function(){
			if(xhr.responseText == "1"){
				console.log(xhr.responseText)
				alert('수정 완료')
				location.href = 'empselct'
			}else {
				console.log(xhr.responseText)
				alert('수정 실패')
			}
		}
		
		
		
	})

</script>
</body>

</html>