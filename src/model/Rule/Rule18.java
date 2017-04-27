package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule18 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowel18 ="eau"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String consonants18 = "q r s d g h k l v b x t p c đ";
        for(int i=0;i<x.length()-1;i++){
            if("ả".contains(x.charAt(i)+"")){
                if(vowel18.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ả".contains(x.charAt(i)+"")){
                if(consonants18.contains(x.charAt(i+1)+""))
                    return false;
            }

        }

        return true;
    }

    @Override
    public String showError() {
        return ("Rule18:\tChỉ có một số nguyên âm được phép đứng đằng sau \"ả\" để tạo thành cặp nguyên âm: ải, ảo, ảy.");
    }
}
