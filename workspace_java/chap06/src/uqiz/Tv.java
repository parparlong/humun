package uqiz;

import java.util.Random;

public class Tv {
	//전원 기능
	//볼륨 up/down(0 ~ 10)까지
	//채널 up/down/직접입력
	//현재 정보 보기
	
	
	
	//전원 on / off void 생성 및 필드 저장
	void status() {
		if(powerOn.equals("ON")) {
			System.out.println("전원상태:"+this.powerOn);
			System.out.println("채널상태:"+this.channel);
			System.out.println("볼륨상태"+this.bolume);	
		}else {
			System.out.println("전원off/상태off");
		}
		
	}
	
	
	String powerOn;
	int bolume ;
	int channel ;
	
	void powerOn() {
		System.out.println("전원을킵니다");
		powerOn = "ON";
	}
	void powerOff() {
		System.out.println("전원끕니다");
		powerOn = "OFF";
	}
	//전원을 킨상태에서 볼륨업 10업까지 가능 up down으로 
	void bolume(String bolume) {
		if(powerOn.equals("ON")) {
			if(bolume.equals("up")) {
				this.bolume++;	
			}else if(bolume.equals("down")){
				this.bolume--;
			}
			
		}
				
	}
	
	void channel(String channel) {
		if(powerOn.equals("ON")) {
			if(channel.equals("up")) {
				this.channel++;	
			}else if(channel.equals("down")){
				this.channel--;
			}else{
				System.out.println("마지막 채널.");
			}
		}
	}
	
	
	/*
	 * up/down
	 * 
	 * 생성시에 임의의 숫자 정하기 / 렌덤 돌려버려
	 * 정답 시도시 감이 오는 숫자 넣기
	 * 결과: 정답, up, down
	 * 정답 맞출때까지, 또는 기회 5번 안에 맞추기
	 * 몰래정답보기(힌트기능) 
	 * 
	 */
	int random = (int) (Math.random() * 10) + 1;
	
	String pick;
	
	void first() {
		System.out.println("랜덤숫자를 맟줘보세요");
	}
	
	void pick(int a) {
		if(random == a) {
		 System.out.println("맞췄습니다.");
		}else if() {
			
		}
	}
	
}

