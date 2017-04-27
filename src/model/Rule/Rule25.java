package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule25 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel20 ="eaio"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants20 = "q r s d g h k l c p t v b x đ";
        for(int i=0;i<x.length()-1;i++){
            if("ầ".contains(x.charAt(i)+"")){
                if(vowel20.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ầ".contains(x.charAt(i)+"")){
                if(consonants20.contains(x.charAt(i+1)+""))
                    return false;
            }

        }

        return true;
    }

    @Override
    public String showError() {

        return ("Chỉ có một số nguyên âm được phép đứng đằng sau \"ầ\" để tạo thành cặp nguyên âm: ầu, ầy");
    }
}
