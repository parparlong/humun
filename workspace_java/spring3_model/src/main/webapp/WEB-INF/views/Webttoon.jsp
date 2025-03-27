<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>
            <style>
                * {
                    margin: 0;
                    padding: 0;
                }

                #header {
                    border: 1px solid black;
                    width: 100vw;
                    text-align: center;
                    font-size: 60px;
                    font-weight: bold;
                }

                #subbar {
                    border: 1px solid black;
                    width: 20vw;
                    text-align: center;
                    font-size: 30px;
                    font-weight: bold;
                }

                #main {
                    border: 1px solid black;
                    width: 30vw;
                    text-align: center;
                    font-size: 30px;
                    font-weight: bold;
                }

                .genre {
                    border: 1px solid black;
                }

                .sub_main_div {
                    display: inline-block;
                    vertical-align: top;
                }

                #sub_main_div_parent {
                    border: 1px solid black;

                }

                table {
                    width: 100%;
                    border-collapse: collapse;
                    height: 500px;

                }

                th,
                td {
                    border: 1px solid black;

                }

                #img-parent {
                    height: 300px;
                }

                .img_size {
                    width: 300px;
                    height: 300px;
                }

                .btn {
                    width: 100px;
                    height: 50px;
                    font-size: 20px;
                    font-weight: bold;
                }

                #button-parent {
                    display: flex;
                    justify-content: right;
                }

                #create_title {
                    display: flex;
                    justify-content: right;
                }

                .hide {
                    display: none;
                }
            </style>

            <body>
                <div>
                    <div id="header">
                        Webtoon
                    </div>
                    <div id="button-parent">
                        <button type="button" id="creat" class="btn">생성</button>
                        <form action="Webttoon" method="post">
                            <button type="submit" id="refresh" class="btn">새로고침</button>
                        </form>
                    </div>
                    <div id="create_title_hide">
                        <div id="create_title">
                            <input type="text" value="사진을넣어주세요" class="new_value">
                            <input type="text" value="제목을넣어주세요" class="new_value">
                            <input type="text" value="작가를넣어주세요" class="new_value">
                            <input type="text" value="설명을넣어주세요" class="new_value">
                            <button type="button" id="ok" class="btn">확인</button>
                        </div>
                    </div>
                    <div id="sub_main_div_parent">
                        <div id="subbar" class="sub_main_div">
                            <ul>
                                <li class="genre">장르</li>
                                <li class="genre">공포</li>
                                <li class="genre">코믹</li>
                                <li class="genre">느와르</li>
                            </ul>
                        </div>
                        <div id="main" class="sub_main_div">
                            <c:forEach var="list" items="${list}">
                                <table id="defult">
                                    <tr id="img-parent">
                                        <th><img src="${list.img_link}" alt="" class="img_size"></th>
                                    </tr>
                                    <tr>
                                        <td>${list.title}</td>
                                    </tr>
                                    <tr>
                                        <td>${list.author}</td>
                                    </tr>
                                    <tr>
                                        <td>${list.explanation}</td>
                                    </tr>
                                </table>
                            </c:forEach>
                        </div>
                    </div>

                </div>
            </body>
            <script>
                window.addEventListener("load", function () {
                    document.querySelector("#create_title_hide").classList.add("hide");

                    //생성
                    document.querySelector("#creat").addEventListener("click", function (e) {
                        e.target.parentNode.parentNode.querySelector("#create_title_hide").classList.remove("hide");
                    })

                    //확인
                    document.querySelector("#ok").addEventListener("click", function (e) {
                        let new_values = e.target.parentNode.querySelectorAll(".new_value")

                        for (let i = 0; i < new_values.length; i++) {
                            console.log(new_values[i].value);

                        }

                        let data = {
                            img_link: new_values[0].value,
                            title: new_values[1].value,
                            author: new_values[2].value,
                            explanation: new_values[3].value
                        }

                        const xhr = new XMLHttpRequest();
                       
                        xhr.open('post', 'insert');
                        xhr.setRequestHeader('Content-Type', 'application/json')
                        xhr.send(JSON.stringify(data))

                        xhr.onload = function () {
                          console.log(xhr.responseText)
                        }




                    })











                })

            </script>

            </html>