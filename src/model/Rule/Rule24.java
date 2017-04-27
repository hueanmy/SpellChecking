package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule24 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel24 ="eaio"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants24 = "q r s d g h k l v b x đ";
        for(int i=0;i<x.length()-1;i++){
            if("ậ".contains(x.charAt(i)+"")){
                if(vowel24.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ậ".contains(x.charAt(i)+"")){
                if(consonants24.contains(x.charAt(i+1)+""))
                    return false;
            }

        }


        return true;
    }

    @Override
    public String showError() {

        return ("Chỉ có một số nguyên âm được phép đứng đằng sau \"ậ\" để tạo thành cặp nguyên âm: ậu, ậy");
    }
}
