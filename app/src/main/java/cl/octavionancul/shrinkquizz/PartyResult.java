package cl.octavionancul.shrinkquizz;

/**
 * Created by Octavio on 02/04/2018.
 */

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }

    public String score() {
        return processing();
    }

    private String processing() {

        String answer = getAnswer();
        if (answer.contains("5")) {
            return "Eres un niño";
        } else if (answer.contains("10")) {
            return "Bien, dale campeón";
        } else {
            return "Consigue ayuda";
        }
    }
}
