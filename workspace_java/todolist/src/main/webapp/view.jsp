<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        body {
            background-color: black;
        }

        #top1 {
            border: 1px solid black;
            width: 50vw;
            margin: 0 auto;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;

        }

        #hour_mom {

            margin-top: 50px;
            background-color: black;
            display: flex;

        }

        #hour {
            color: white;
            font-size: 50px;
        }

        #ap_pm {
            color: white;
            font-size: 30px;
            border: 1px solid white;
            padding-top: 20px;

        }

        #list_count {
            background-color: orange;
            width: 100%;
            border: 1px solid white;
            text-align: right;
        }

        #count {
            margin-right: 20px;
            font-size: 30px;
            color: white;
            font-weight: bold;
        }

        #text_list {
            border: 1px solid white;
            background-color: #eeeeee;
            width: 100%;
            height: 300px;
            display: flex;



        }

        #text {
            width: 70%;
            margin: 0 auto;
            border: 1px solid black;

        }

        #plus {
            background-color: red;
            width: 100%;
            height: 75px;
            text-align: center;
            font-size: 75px;
        }

        #icon_navigation {
            border: 1px solid white;
            color: white;
            width: 100%;
            display: flex;
            justify-content: center;
            height: 75px;
            background-color: rgb(11, 74, 211);


        }

        .icon_margin {
            border: 1px solid white;
            margin: 0 50px 0 50px;
            display: flex;
            align-items: center;
        }

        .hide {
            display: none;
        }

        .text_contest {
            width: 100%;
            height: 30px;
        }

        #hide1 {
            width: 100%;
        }
    </style>
</head>

<body>k
    <div id="top1">
        <!-- 시간 -->
        <div id="hour_mom">
         <div id="hour">
          <fmt:formatDate
        value="<%=new Date()%>"
		pattern="HH:mm" />   
		</div>
        </div>
        <!-- 리스트 항목겟수 -->
        <div id="list_count">
            <div id="count">0</div>
        </div>

        <!-- 글생성위치 -->
        <div id="text_list">
            <div id="text"></div>
        </div>

        <!-- 글자박스추가 -->
        <div id="plus">+</div>
        <!-- 확인/수정/삭제 -->
        <div id="hide1">
            <div id="icon_navigation">
                <form method="get" action="post">
                    <input class="icon_margin" id="ok" type="button" value="확인">
                    <input class="icon_margin" id="update" type="button" value="수정">
                    <input class="icon_margin" id="dedel" type="button" value="삭제">
                </form>

            </div>
        </div>
    </div>
    <script>
        window.addEventListener("load", function () {
            document.querySelector("#hide1").classList.add("hide")
            // 텍트스 투가이벤트
            document.querySelector("#plus").addEventListener("click", function () {
                let conut = 0;
                count++
                budae = document.createElement("div")
                budae.innerHTML = `
                        <input type="text" class="text_contest" name="text">
                    
                `
                let text = document.querySelector("#text")
                text.append(budae)
                document.querySelector("#hide1").classList.remove("hide")
                document.querySelector("#plus").classList.add("hide")
                // 확인아이콘
           
            document.querySelector("#ok").addEventListener("click", function (e) {
            	  let a = budae.querySelector(".text_contest").value
                  console.log(a)
            	ajax("Post");
            });
            document.querySelector("#update").addEventListener("click", function () {
                ajax("Post");
            });
            document.querySelector("#update").addEventListener("click", function () {
                ajax("Post");
            });

            function ajax(method) {
            	let a = budae.querySelector(".text_contest").value
            	
                let url = "controller"
                const xhr = new XMLHttpRequest();
                xhr.open(method, url);
                xhr.setRequestHeader("Content-Type",
                    "application/x-www-form-urlencoded");
                xhr.send("a="+a);
            }
            })
            
	
			


        })
    </script>

</body>

</html>