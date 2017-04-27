package model.Rule;

/**
 * Created by katie on 13/03/2017.
 */
public class Rule10 extends Rule {
    @Override
    public boolean isValid(String x) {
        String consonants = "q r t p s d g h k l x c v b n m";
        String vowel = "eyuioa"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            ;
        int count=0;
        for(int i = 0; i<x.length()-1;i++){
            if(consonants.contains(x.charAt(i)+""))
                count++;
        }
        if(count>=3){
            if("n".contains(x.charAt(0)+""))
                if("g".contains(x.charAt(1)+""))
                    if(vowel.contains(x.charAt(2)+""))
                        return true;
                    else if(!"h".contains(x.charAt(2)+""))
                        return false;
        }
        return true;
    }

    public String showError() {
        return ("Nếu một từ có 3 phụ âm cạnh nhau => đó phải là ngh");
    }
}
