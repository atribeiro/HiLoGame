package funkyhilo.constants;

import funkyhilo.exception.InvalidChoiceException;

/**
 * Created by Anabela on 02/08/2015.
 */
    public enum Choice {
    HI, LO, DRAW;

    public static Choice parse(String usersChoice) throws InvalidChoiceException {

        Choice choice = null;
        String input = null;
        if (usersChoice != null && usersChoice.length() > 0) {
            //get the first character as the input
            input = String.valueOf(usersChoice.toLowerCase().charAt(0));

            switch (input) {

                case "h":
                case ">":
                    //user select high or any variant of it
                    choice = Choice.HI;
                    break;

                case "l":
                case "<":
                    //user select low or any variant of it
                    choice = Choice.LO;
                    break;

                case "d":
                case "=":
                    //user select draw or any variant of it
                    choice = Choice.DRAW;
                    break;

                default:

                    throw new InvalidChoiceException(usersChoice);
            }
        } else {
            throw new InvalidChoiceException("<<carriage return>>");
        }
        return choice;

    }
}




