window.addEventListener("load", init)
function init() {


    //설명4개를 none (css했고)

    //부모한테 클릭이벤트 주고 
    let con_ex = document.querySelector("#con_ex")
    con_ex.classList.remove('explanation')
    document.querySelector("#imegi_top")
        .addEventListener("click", function (event) {
            console.log(event.target)
            console.log(event.target.getAttribute("id"))

            //각클릭시 설명4개중맞는거 1개를 none > blaock
            con_ex = document.querySelector("#con_ex")
            let pak_ex = document.querySelector("#pak_ex")
            let siso_ex = document.querySelector("#siso_ex")
            let alpa_ex = document.querySelector("#alpa_ex")
            explanations = document.querySelectorAll('.explanation')


            con_ex.classList.add('explanation')
            pak_ex.classList.add('explanation')
            siso_ex.classList.add('explanation')
            alpa_ex.classList.add('explanation')

            if (event.target.getAttribute("id") == 'con') {
                // console.log(event.target.getAttribute("id"))
                con_ex.classList.remove('explanation')
            } else if (event.target.getAttribute("id") == 'pak') {
                // console.log(event.target.getAttribute("id"))
                pak_ex.classList.remove('explanation')
            } else if (event.target.getAttribute("id") == 'siso') {
                // console.log(event.target.getAttribute("id"))
                siso_ex.classList.remove('explanation')
            } else if (event.target.getAttribute("id") == 'alpa') {
                // console.log(event.target.getAttribute("id"))
                alpa_ex.classList.remove('explanation')
            }



        })
    //넣기 버튼 클릭 이벤트 생성 
    document.querySelector('#button')
        .addEventListener("click", function () {
            let comment = document.querySelector("#comment").value
            let cope = document.querySelector('#scope').value
            //댓글 별점 콘솔 출력확인 
            // console.log(comment,cope)
            //출력물을 넣을 dom생성 
            let correction
            let div = document.createElement('div')
            div.setAttribute('id','print_total')
            // div.id = "print_total"
            console.log("div",div)
            div.innerHTML = `
            <input type="text" id="output_print" value="${comment},${cope}">
            <input type="button" value="수정" class="output_button1">
            <input type="button" value="삭제" class="output_button2">
            `
            //삭제 코드
            div.querySelector('.output_button2').addEventListener('click', function (event) {
                event.target.parentNode.remove();
                console.log('event.target', event.target)
            })
            //수정버튼 코드


            div.querySelector('.output_button1').addEventListener('click', function (event) {
                console.log("후", event.target)

                output_print = div.querySelector('#output_print').value

                correction = document.createElement('div')
                correction.innerHTML = `
            <br>
            <br>
            <input type="text" id="correction_text" value="${output_print}">
            <input type="button" value="완료" id="correction_button1">
           
            <br>
            <br>`
            // console.log("zz",correction_button1);

                // let print_total = document.querySelector('#print_total')
                //수정 완료버튼
                correction.querySelector('#correction_button1').addEventListener('click', function (ev) {
                    // console.log(after_correction_value)
                    //기존값
                    let correction_text = document.querySelector("#correction_text")
                    let output_print = div.querySelector("#output_print")
                    output_print.value = correction_text.value
                    console.log(output_print)
                    ev.target.parentNode.remove();


                })


                output.append(correction)

            })
            
            
            console.log(correction)
            output.append(div)
            
            console.log(div)
            console.log(output)

            // document.querySelector('#output_button2')
            // .addEventListener('click',function(event){
            //     event.target.parentNode.remove();
            //     console.log(event.target)
            // })
            // let output_button2s = document.querySelectorAll('#output_button2')
            // for (let i = 0; i < output_button2s.length; i++) {
            //     output_button2s[i].addEventListener("click", function (e) {
            //         e.target.parentNode.remove();
            //     })
            // }

            // console.log("수정버튼테스트전")
            // //수정 클릭 이벤트 완
            // let output_button1s = document.querySelectorAll('#output_button1')
            // for (let j = 0; j < output_button1s.lengthl; j++) {
            //     output_button1s[j].addEventListener("click", function () {
            //         console.log("수정버튼테스트")
            //         //수정을 누른 텍스트 장에 벨류 가져오기

            //         //수정누르면 수정 칸이랑 수정완료 dom생성
            //         let correction = document.createElement('div')
            //         let output_print_value = document.querySelector('#output_print').value

            //         `
            //         let correction_start = document.querySelector('#correction_start')
            //         correction_start.append('correction')
            //         console.log(correction_start)
            //     })






            // }

        })







    //출력물을 dom생성한곳에 출력 






}

