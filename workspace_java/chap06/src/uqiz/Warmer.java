package uqiz;

public class Warmer {
	// 전원 켜기 기능
	// 전원 끄기 기능
	//-- 전원 on일시-- 
	// 저온 발열 기능
	// 고온 발열 기능
	// 발열 중지 기능 
	// 상태 표시 기능 (전원 상태와 발열 상태 출력)
	
	//처음부터 전원 off 
	boolean powerOn = false; //파워 on off
	
	Warmer(){
		System.out.println("초기상태 Power off");
	}
	
	String powerOnOffs; //true,false 상태를 on/off로 저장필드
	//true,false 상태를 on/off상태로 바꾼다
	void powerOnOff(String a) {
		if(a.equals("on")) {
			System.out.println("시스템이On되었습니다.");
			System.out.print("온도를 몇단으로하시겠습니까?  ");
			System.out.println("예: 1단, 2단,3단,4단,중지");
			powerOn = true;
				if(powerOn = true) {
				powerOnOffs = "on";
				}
		}else if(a.equals("off")){
			System.out.println("시스템이Off되었습니다.");
			powerOn = false;
				if(powerOn = true) {
				powerOnOffs = "off";
				}
		}else {
			System.out.println("다시입력해주세요");
		}
	}
	String temperature; //온도,단수 필드 저장
	//저온 고온 발열 
	void temperature(String a) {
		if(powerOn == true) { //전원이 켜져 있어야지만 출력
			if(a.equals("1단")) {
				this.temperature = a;
			}else if(a.equals("2단")) {
				this.temperature = a;
			}else if(a.equals("3단")) {
				this.temperature = a;
			}else if(a.equals("4단")) {
				this.temperature = a;
			}else if(a.equals("중지")) {
				this.temperature = a;
			}else{
				this.temperature = a;
				System.out.println("정확한값이아닙니다");
			}
		}
	}
	void status() {
		System.out.println("----------------");
		System.out.println("현재 on/off상태 :"+this.powerOnOffs);
		System.out.println("현재 온도상태 :"+this.temperature);
		System.out.println("----------------");
	}

	
	String onOff;
	String hight;
	//디스플레이에 출력
	void display() {
		System.out.println(this.onOff);

	}
	//온에다가 뭘하면 온?
	void powerOn() {
		this.onOff = "파워온!";
	}
	//오프에다가 뭘하면 오프?
	void powerOff() {
		this.onOff = "파워오프!";
	}
	void higth() {
		
	}
	
	void low() {
		if(this.onOff.equals("파워온!")) {
			System.out.println("저온으로 따뜻하게");
		}else{
			System.out.println("전원이꺼져있습니다");
		}
	}
	
	void hight() {
		if(this.onOff.equals("파워온!")) {
			System.out.println("고온으로 따뜻하게");
		}else if(this.onOff.equals("파워오프!")) {
			System.out.println("저온으로 따뜻하게");
		}
	}

	
	
	
}
