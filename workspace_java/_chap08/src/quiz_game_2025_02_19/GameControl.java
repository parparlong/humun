package quiz_game_2025_02_19;

class test {
//default 클레스기때문에 같은 페키지 안에서만 사용가능	
}

public class GameControl {

	public static void main(String[] args) {
		
		String id = "admin";
		String pw = "1234";
		GameDTO dto = new GameDTO();
		dto.setId(id);
		dto.setPw(pw);
				
		
		GameService service = new GameServiceimpl();
		dto = service.getMember(dto);
		
		if(dto != null) {
			System.out.println("로그인 성공");
			System.out.println("안녕하세요! " + dto.getName()+"님 "+dto.getAge()+"살입니다");
			System.out.println("메인 페이지로 이동");
		}else {
			System.out.println("로그인 실패");
			System.out.println("아이디나 비밀번호를 확인해주세요");
		}
	}

}
