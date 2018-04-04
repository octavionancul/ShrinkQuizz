package cl.octavionancul.shrinkquizz;

import android.util.Log;

/**
 * Created by Octavio on 03/04/2018.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    private String proccesingMatch(){
        int userAge = getUserAge();
        int loverAge = getLoverAge();
        int result = Math.abs(userAge-loverAge);
        Log.d("match",String.valueOf(result));
        if(result<=10){
            return "Son el uno para el otro";
        }else{
            return "buscate otro(a)";
        }



    }

    public String getMatchResult(){

        return proccesingMatch();
    }

}
