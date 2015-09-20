package funkyhilo.Services;

import funkyhilo.constants.Choice;
import funkyhilo.constants.ReplayChoice;
import funkyhilo.exception.InvalidChoiceException;

/**
 * Created by Anabela on 20/09/2015.
 */
public interface MessageService {

    public void displayMessage(String message);
    public Choice getPlayerChoice() throws InvalidChoiceException;
    public ReplayChoice getReplayChoice();

}
