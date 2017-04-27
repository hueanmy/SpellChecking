package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule41 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel41 = "ơ ờ ở ";
        for(int i =0;i<x.length()-1;i++){
            if(vowel41.contains(x.charAt(i)+"")){
                if(!"i n m".contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ớ ợ".contains(x.charAt(i)+"")){
                if(!"i n m t p".contains(x.charAt(i+1)+""))
                    return false;
            }
        }
        return true;
    }

    @Override
    public String showError() {

        return ("Rule41:\tNguyên âm \"ơ\", \"ớ\", \"ờ\", \"ở\", \"ợ\" thì chỉ có đằng sau là nguyên âm \"i\"");
    }
}
