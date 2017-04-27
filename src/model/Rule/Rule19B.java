package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule19B extends Rule {
    public boolean isValid(String x) {
          String vowel19B ="ea"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants19B = "q r s d g h k l v b x t p c đ";
        for(int i=0;i<x.length()-1;i++){
            if("à".contains(x.charAt(i)+"")){
                if(vowel19B.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("à".contains(x.charAt(i)+"")){
                if(consonants19B.contains(x.charAt(i+1)+""))
                    return false;
            }

        }
        return true;
    }

    public String ShowError() {

        return ("Rule19B: Chỉ có một số nguyên âm được phép đứng đằng sau \"à\" để tạo thành cặp nguyên âm: ài, àu, ào, ày");
    }
}
