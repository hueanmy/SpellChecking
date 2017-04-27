package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule28 extends Rule {

    @Override
    public boolean isValid(String x) {
        String nguyenam = "yio"
            + "èéẹẻẽ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String phuamkhongdivs_i = "q r t p s d g h k l x c v đ b";
        for(int i=0;i<x.length()-1;i++){
            if("i".contains(x.charAt(i)+"")){
               if(nguyenam.contains(x.charAt(i+1)+""))
                   return false;
               if(phuamkhongdivs_i.contains(x.charAt(i+1)+""))
                   return false;
            }
        }

        return true;
    }

    @Override
    public String showError() {

        return ("Các nguyên âm được phép sau nguyên âm \"i\": ia, iu, iê, iế, iệ, iể, iễ, iề,");
    }
}
