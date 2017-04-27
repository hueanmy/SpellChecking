package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule15 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel15 ="ea"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants15 = "q r s d đ g h k l v b x";
        for(int i=0;i<x.length()-1;i++){
            if("á".contains(x.charAt(i)+"")){
                if(vowel15.contains(x.charAt(i+1)+""))
                    return false;
                if(consonants15.contains(x.charAt(i+1)+""))
                    return false;
            }
        }
         return true;
    }

    @Override
    public String showError() {
        return ("Chỉ có một số nguyên âm được phép đứng đằng sau \"á\" để tạo thành cặp nguyên âm:ái, áu, áo, áy");
    }
}
