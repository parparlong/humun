window.addEventListener("load", function () {
    console.log(12314212);

    let btn1 = document.querySelector("#btn1");
    console.log("btn1 :", btn1);
    btn1.addEventListener("click", function () {
        let id = document.querySelector("#id")
        console.log("id :", id, id.value);
        let pw = document.querySelector("#pw")
        console.log("pw :", pw, pw.value);
        let qqq = document.querySelector("#qqq")
        let qqq2 = document.querySelector("#qqq2")
        let www = document.querySelector("#pw1")
        qqq.style.color = 'red';
        qqq2.style.color = 'red';
        if (!(id.value == '' || id.value == null || id.value == undefined ||
            pw.value == '' || pw.value == null || pw.value == undefined)) {
            qqq.innerHTML = "정상적으로 로그인하셨습니다"
        } else if (id.value == '' || id.value == null || id.value == undefined) {
            qqq.innerHTML = "아이디는 필수 입니다."
        } else if (pw.value == '' || pw.value == null || pw.value == undefined) {
            qqq.innerHTML = "비밀번호는 필수 입니다."
        } 
        if(pw.value != pw1.value){
            qqq2.innerHTML = "비밀번호를 확인하세요."
        }else{
            qqq2.innerHTML = " "
        }

    })

    //시간함수를 만들고 
      function total() {
        let now = new Date() ;
    
        // let splice = now.splice(2,3);
        // let splice1 = now.substr(2,3);


        let iso = now.toISOString();
        let Tiso = iso.split("T");
        let value = Tiso[1].split(".");
        let value2 = value[0];
        let com = this.document.querySelector("#date");
        let value3 = value2.split(":")
        let value4 = parseInt(value3[0])
        let value5 = value4 + "9"
        
        com.innerHTML = value2 +"<br>"+ now +"<br>"+ value3[0]+"<br>"+ value5;
    }
    
    // 셋인터벌로 시간함수를 실행시킨다
    this.setInterval(() => {
        total();
    }, 3 * 100);




})





