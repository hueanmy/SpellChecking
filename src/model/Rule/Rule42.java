package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule42 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel42 = "ô ồ ổ ";
        for(int i =0;i<x.length()-1;i++){
            if(vowel42.contains(x.charAt(i)+"")){
                if(!"i n m".contains(x.charAt(i+1)+""))
                    return false;
            }
            else if("ố ộ".contains(x.charAt(i)+"")){
                if(!"i n m t p c".contains(x.charAt(i+1)+""))
                    return false;
            }
            else if("ỗ".contains(x.charAt(i)+"")){
                if(!"i n".contains(x.charAt(i+1)+""))
                    return false;
            }
        }

        return true;
    }

    @Override
    public String showError() {

        return ("Rule42:\tNguyên âm \"ô\", \"ố\", \"ồ\", \"ổ\", \"ộ\", \"ỗ\" thì chỉ có đằng sau là nguyên âm \"i\"");
    }
}
