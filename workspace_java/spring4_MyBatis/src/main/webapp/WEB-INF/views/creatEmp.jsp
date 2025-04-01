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
				<td><input type="text" id="empno"></td>
			</tr>
			<tr>							
				<th>ename</th>
				<td><input type="text"  id="ename"></td>
			</tr>
			<tr>							
				<th>sal</th>
				<td><input type="text"  id="sal"></td>
			</tr>
			<tr>							
				<th>comm</th>
				<td><input type="text" id="comm"></td>
			</tr>
			<tr>							
				<th>hiredate</th>
				<td><input type="date"id="hiredate"></td>
			</tr>
	
	</table>
	<input type="button" id="modify" value="생성하기">

<!-- </form> -->
<script>



	document.querySelector("#modify").addEventListener("click",function(e){
		
		const empno = document.querySelector("#empno").value
		const ename = document.querySelector("#ename").value
		const sal = document.querySelector("#sal").value
		const comm = document.querySelector("#comm").value
		const hiredate = document.querySelector("#hiredate").value
	
		//방어코딩이란? 공백/숫자인대 글자가들어갈떄, 3000 == 3,000이랑같을때 또뭐있지?
		//그냥 input='number'로 바꾸는게 더 편하지 않을까
		if(empno == "" || isNaN(empno)){
		// if(empno == "" ||  parsInt((empno.replace(/,/g,"")))   ){
			alert('사원번호를 다시 입력하세요')
			document.querySelector("#empno").focus()
			
		}else if(ename == ""){	
			alert('사원이름를 입력하세요')
			document.querySelector("#ename").focus()
		
		}else if(sal == "" || isNaN(sal)){	
			alert('급여를 입력하세요')
			document.querySelector("#sal").focus()
			
		}else if(comm == "" || isNaN(comm)){	
			alert('보나스를 입력하세요')
			document.querySelector("#comm").focus()
		
		}else if(hiredate == ""){	
			alert('사원입사일자를 입력하세요')
			document.querySelector("#hiredate").focus()
			
		}else{
			console.log(empno)
			console.log(ename)
			console.log(sal)
			console.log(comm)
			console.log(hiredate)
			
			let param = {
					empno : empno,
					ename : ename,
					sal : sal,
					comm : comm,
					hiredate : hiredate
			}
			
			// ajax
			const xhr = new XMLHttpRequest();
			xhr.open('post','insertEmp')
			xhr.setRequestHeader('Content-Type','application/json')
			xhr.send(JSON.stringify(param))
			xhr.onload = function(){
				if(xhr.responseText == "1"){
					console.log(xhr.responseText)
					alert('생성 완료')
					location.href = 'empselct'
				}else {
					console.log(xhr.responseText)
					alert('생성 실패')
				}
			}
		}
		
		
		
	})

</script>
</body>

</html>