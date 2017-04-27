package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule17 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel17 ="eau"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants17 =  "q r s d g h k l v b x đ";
        for(int i=0;i<x.length()-1;i++){
            if("ạ".contains(x.charAt(i)+"")){
                if(vowel17.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ạ".contains(x.charAt(i)+"")){
                if(consonants17.contains(x.charAt(i+1)+""))
                    return false;
            }

        }
        return true;
    }

    @Override
    public String showError() {
        return ("Chỉ có một số nguyên âm được phép đứng đằng sau \"ạ\" để tạo thành cặp nguyên âm:ại, ạo, ạy");
    }
}
