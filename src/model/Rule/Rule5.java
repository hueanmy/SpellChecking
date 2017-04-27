package model.Rule;

/**
 * Created by katie on 11/03/2017.
 */
public class Rule5 extends Rule{
    public boolean isValid(String x) {
        String VowelCharacters = "eyuioa"
                + "èéẹẻẽ" + "ê" + "ềếệểễ"
                + "ùúụủũ" + "ư" + "ừứựửữ"
                + "ìíịỉĩ"
                + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
                + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
                + "ỳýỵỷỹ"
                ;
        int count = 0;
        for(int i = 0; i<x.length();i++){
            if(VowelCharacters.contains(x.charAt(i) +"")){
               count++;
            }
        }
        if(count>=1&&count<=3){
            return true;
        }
        else
            return false;
    }

    public String showError() {
        return ("Một từ tiếng Việt tối đa là 3 nguyên âm");
    }
}
