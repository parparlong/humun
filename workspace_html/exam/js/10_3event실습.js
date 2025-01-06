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
        let radio1 = document.querySelector('[name="size"]:checked');
        let checkbox2 = document.querySelector("[type='checkbox']:checked");
        let request = document.querySelector("#request");
        let total = document.querySelector("#view");
        
        View.innerHTML = "주문하신내역은 <br>"

        console.log(sel.value);
      view.innerHTML += text.querySelector("option:checked").textContent+"피자"
   
    })



})