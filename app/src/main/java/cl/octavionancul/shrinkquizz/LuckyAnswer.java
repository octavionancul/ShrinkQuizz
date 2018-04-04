package cl.octavionancul.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;


public class LuckyAnswer {
    private boolean answerUser;
    private boolean luckyDay;

    public LuckyAnswer(boolean answerUser) {
        this.answerUser = answerUser;
        this.luckyDay = new LuckyDate().getLuckyDay();
    }

    public boolean isAnswerUser() {
        return answerUser;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

   private class LuckyDate{

        public boolean getLuckyDay(){

            //When you instance a new date by default the date is today, actually is now in milliseconds
            Date date = new Date();
            //To transform this date to a simple String in date format, you have to create a SimpleDateFormat
            //the String param that the constructor accept is an ISO date format, below the instantiation you can see some more
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            //for getting the int value then we have to parse the String result obtained from the simpleDateFormat transformation
            //pay special attention the simpleDateFormat.format(date) that is what transform Date --> String
            int day = Integer.parseInt(simpleDateFormat.format(date));
            //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            //Looking for some more interesting date formats, look at this StackOverflow answer
            //http://stackoverflow.com/questions/5121976/is-there-a-date-format-to-display-the-day-of-the-week-in-java
            if(day%2==0){
                return true;
            }else{
                return false;
            }
        }

    }
}
