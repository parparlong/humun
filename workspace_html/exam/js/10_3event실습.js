window.addEventListener("load", function () {


    let check = document.querySelector("#check");
    check.addEventListener("click", function () {
        let text = document.querySelector("#text");
        let pone = document.querySelector("#pone");
        let address = document.querySelector("#address");
        let text1 = document.querySelector("#text1");
        let pone1 = document.querySelector("#pone1");
        let address1 = document.querySelector("#address1");

        if (check.checked) {
            text1.value = text.value;
            pone1.value = pone.value;
            address1.value = address.value;
        } else {
            text1.value = "";
            pone1.value = "";
            address1.value = "";
        }

    })


    
    let btn1 = document.querySelector("#btn1");
    btn1.addEventListener("click", function () {
        let sel = document.querySelector("#sel");
        let size = document.querySelector('[name="size"]:checked');
        let checkbox = document.querySelector("[type='checkbox']:checked");
        let request = document.querySelector("#request");
        let view = document.querySelector("#view");
        
        view.innerHTML = "주문하신내역은 <br>"

        console.log(sel.value);
        //option에 적은 글 이용하기
    //   view.innerHTML += text.querySelector("option:checked").textContent+"피자"
   

    //option의 속성 이용하기
    view.innerHTML += sel.querySelector("option:checked").getAttribute("data-name");

        if(size.value == 1){
            view.innerHTML += "<br>사이즈 미디움"
        }else if(size.value == 2){
            view.innerHTML += "<br>사이즈 라지"
        }else if(size.value == 3){
            view.innerHTML += "<br>사이즈 패밀리"
        }


        checkbox.forEach(element,index,array) {
            console.log()      
        });
    view.innerHTML += checkbox.querySelector("option:checked").getAttribute("data-name");
    
    



})



})