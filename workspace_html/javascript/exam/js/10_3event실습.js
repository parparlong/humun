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
        let checkbox = document.querySelectorAll("[type='checkbox']:checked");
        let request = document.querySelector("#request");
        let view = document.querySelector("#view");

        view.innerHTML = "주문하신내역은 <br>"

        console.log(sel.value);
        view.innerHTML += sel.querySelector("option:checked").getAttribute("data-name");

        if (size.value = 1) {
            view.innerHTML += "<br>미디움";
        } else if (size.value = 2) {
            view.innerHTML += "<br>라지";
        } else if (size.value = 3) {
            view.innerHTML += "<br>패밀리<br>";
        }
        view.innerHTML += "<br>"
        console.log(checkbox);
        
        checkbox.forEach(function (element, index, array) {

            view.innerHTML += element.getAttribute("data-name");
            console.log(element, index, array);
            if (index != array.length - 1) {
                view.innerHTML += ","
            }


        })
        view.innerHTML += "<br>"
        view.innerHTML += request.value

    })



})











