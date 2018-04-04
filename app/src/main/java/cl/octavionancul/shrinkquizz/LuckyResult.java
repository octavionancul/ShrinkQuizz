package cl.octavionancul.shrinkquizz;

/**
 * Created by Octavio on 03/04/2018.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean answerUser) {
        super(answerUser);
    }

    private String proccesingAnswer(){

       boolean answer = isAnswerUser();

       if (answer){
           return "Esa es la actitud!";
       }else{
           return "Animate!";
       }

    }

    private String proccesingLuckyDay(){

        boolean luckyDay = isLuckyDay();

        if(luckyDay){
            return "y es tu dia de suerte!";
        }else{
            return "vendran mejores tiempos";
        }

    }

    public String getLuckyResult(){

        return proccesingAnswer() + " " + proccesingLuckyDay();
    }


}
