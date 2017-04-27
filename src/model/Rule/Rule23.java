package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule23 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel23 ="eaio"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants23 = "q r s d g h k l v c p t b x đ";
        for(int i=0;i<x.length()-1;i++){
            if("ẫ".contains(x.charAt(i)+"")){
                if(vowel23.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ẫ".contains(x.charAt(i)+"")){
                if(consonants23.contains(x.charAt(i+1)+""))
                    return false;
            }

        }

        return true;
    }

    @Override
    public String showError() {

        return ("Rule23:\tChỉ có một số nguyên âm được phép đứng đằng sau \"ẫ\" để tạo thành cặp nguyên âm: ẫu, ẫy");
    }
}
