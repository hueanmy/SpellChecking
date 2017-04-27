package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule16 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel15 ="eau"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants15 = "q r s d g h k l v b x t p c đ";
        for(int i=0;i<x.length()-1;i++){
            if("ã".contains(x.charAt(i)+"")){
                if(vowel15.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ã".contains(x.charAt(i)+"")){
                if(consonants15.contains(x.charAt(i+1)+""))
                    return false;
            }

        }

        return true;
    }

    @Override
    public String showError() {
        return ("Chỉ có một số nguyên âm được phép đứng đằng sau \"ã\" để tạo thành cặp nguyên âm:ãi, ão, ãy");
    }
}
