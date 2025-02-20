package quiz_game_2025_02_19;

public class GameDAOimpl implements GameDAO{

	String id = "admin";
	String pw = "1234";
	String name = "이름";
	int age = 20;
	
	@Override
	public GameDTO selectMember(GameDTO dto) {
		if(dto.getId().equals(this.id) && dto.getPw().equals(this.pw)) {
			dto.setName(this.name);
			dto.setAge(this.age);
			return dto;
		}else {
			return null;			
		}
	}
	
}	
