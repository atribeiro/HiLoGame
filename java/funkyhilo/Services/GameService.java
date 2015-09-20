package funkyhilo.Services;

import funkyhilo.constants.Choice;
import funkyhilo.model.Game;
import funkyhilo.model.GameResult;

/**
 * Created by Anabela on 20/09/2015.
 */
public interface GameService {

    public Game startGame();

    public GameResult endGame(Game game, Choice playerChoice);

}
