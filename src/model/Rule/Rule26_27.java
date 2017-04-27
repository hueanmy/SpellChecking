package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule26_27 extends Rule {
    @Override
    public boolean isValid(String x) {
        String nguyenam = "eyuioa"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String nguyenamrieng = "ằ ắ ẵ ẳ ặ ă";
        for(int i=0;i<x.length()-1;i++){
            if(nguyenamrieng.contains(x.charAt(i)+"")){
               if(nguyenam.contains(x.charAt(i+1)+""))
                   return false;
            }
        }

        return true;
    }

    @Override
    public String showError() {

        return ("Rule26_27:\tCũng tương tự như thế, không có nguyên âm nào đằng sau \"ằ\", \"ắ\", \"ẵ\", \"ẳ\", \"ặ\"");
    }
}
