package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule41 extends Rule {
    @Override
    public boolean isValid(String x) {
        if(vowelsCount(x)==2){
            for(int i=0; i<x.length()-1; i++){
                if(((x.charAt(i)+"").contains("ơ") 
                        || (x.charAt(i)+"").contains("ớ") 
                        || (x.charAt(i)+"").contains("ờ") 
                        || (x.charAt(i)+"").contains("ở") 
                        || (x.charAt(i)+"").contains("ợ"))
                        && nguyenam.contains(x.charAt(i+1)+"")){
                    if((x.charAt(i+1)+"").contains("i")){
                        return true;
                    }
                    else return false;
                }
            }
        }
        return true;
    }

    @Override
    public String showError() {

        return ("Rule41:\tNguyên âm \"ơ\", \"ớ\", \"ờ\", \"ở\", \"ợ\" thì chỉ có đằng sau là nguyên âm \"i\"");
    }
}
