package sec01.exam01;

public class odioContr implements RemoteControl {

	int vol;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");

	}

	@Override
	public void seVolume(int volume) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;

		System.out.println(volume + "로 볼륨을 바꿉니다.");
		if (volume < min) {
			this.vol = min;
			System.out.println(this.vol + "입니다");
		} else if (volume > max) {
			this.vol = max;
			System.out.println(this.vol + "입니다");
		}

	}

	@Override
	public void mic(String text) {
		
	}

}
