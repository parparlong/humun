<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
<script>
	window.addEventListener('load',function(){
		const btn = document.querySelector("#btn")
		btn.addEventListener('click',function(){
			console.log("click!!")
			//json으로 주고받는 방법
			let data={
				id: "1234",
				pw: "pwpw"
			}
			
			const xhr= new XMLHttpRequest()
// 			xhr.open('get','ui/login.do')
// 			xhr.open('post','ajax1')
// 			xhr.open('post','ajax2')
// 			xhr.open('post','ajax3')
			xhr.open('post','ajax4')
		
			xhr.setRequestHeader('Content-Type','application/json')
			xhr.send(JSON.stringify(data))
			
			xhr.onload = function(){
				console.log(xhr.responseText)
			}
			
		})
	})
</script>
</head>
<body>
	ajax.jsp<br>
	<input type="button" id="btn" value="ajax 실행">
</body>
</html>