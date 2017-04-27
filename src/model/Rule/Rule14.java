package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule14 extends Rule {
    @Override
    public boolean isValid(String x) {
        String nguyenamcodau = "ea"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        for(int i=0;i<x.length()-1;i++){
            if("a".contains(x.charAt(i)+"")){
                if(nguyenamcodau.contains(x.charAt(i+1)+""))
                    return false;
            }
        }
        return true;
    }

    @Override
    public String showError() {
        return ("Rule14:tất cả những nguyên âm nào có dấu thì không được đi sau a: aa, aô, aê, aư, aơ, aă, aâ, ae");

    }
}
