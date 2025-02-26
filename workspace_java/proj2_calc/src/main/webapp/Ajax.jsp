<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	
</script>
</head>
<body>
	<button id="doGet">doGet</button>
	<button id="doPost">doPost</button>

	<script>
		document.querySelector("#doGet").addEventListener("click", function() {
			ajax();
		});
		document.querySelector("#doPost").addEventListener("click", function() {
			ajax("Post");
		});
		function ajax(method) {
			// 	function ajax(method="get"){
			// 	doGet일때만 실행하는 메소드 
			if (!method)
				method = "get";

			let url = "req"
			if (method == 'get') {
				url += "?num1=123&num2=abc"
			}
			// 			브라우저에서 http요청을 보내고 응답받을수있는 클래스 성생
			const xhr = new XMLHttpRequest();
			// 			기존에 방식과 주소를 해당 클래스에 전달
			xhr.open(method, url);
			// 			겟방식이면 기존에 있던걸 전송
			if (method == 'get') {
				xhr.send();
			} else {
				// 				포스트방식이면 헤더방식에 값과 메타데이터를 전송
				xhr.setRequestHeader("Content-Type",
						"application/x-www-form-urlencoded");
				xhr.send("num1=123&num2=abc");
			}
			// 	요청/응답이끝났을때 온로드이벤트생성 받아온값을 json으로 출력
			// 	자바에서 오는 값을 받아서 console에 출력
			xhr.onload = function() {
				console.log(xhr.responseText);
				try {
					const json = JSON.parse(xhr.responseText);
					console.log(json);
				} catch (e) {
					console.log(e)
				}
			}
		}
	</script>
</body>
</html>