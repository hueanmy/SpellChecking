package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule38 extends Rule {
    @Override
    public boolean isValid(String x) {
    String VowelCharacters = "eyuioa"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
    for(int i=0;i<x.length()-1;i++){
        if("ể".contains(x.charAt(i)+""))
            if(VowelCharacters.contains(x.charAt(i+1)+""))
                return false;
            else if(!"n m".contains(x.charAt(i+1)+""))
                return false;
    }
        return true;
    }

    @Override
    public String showError() {
        return ("Nguyên âm \"ể\" không có nguyên âm khác đi sau.");
    }
}
