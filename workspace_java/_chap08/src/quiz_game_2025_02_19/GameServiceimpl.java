package quiz_game_2025_02_19;

public class GameServiceimpl 
	implements GameService{

	@Override
	public GameDTO getMember(GameDTO gameDTO) {
		GameDAO dao = new GameDAOimpl();
		
		gameDTO = dao.selectMember(gameDTO);
		return	gameDTO;
		
	}

}
