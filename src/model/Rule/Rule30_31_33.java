package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule30_31_33 extends Rule {
    public boolean isValid(String x) {
        String nguyenam = "eyio"
            + "èéẹẻẽ"+"ê"+"ềếệễể"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        String phuamkhongdivs_ì = "q r t p s d g h k l x c v b đ";
        for(int i=0;i<x.length()-1;i++){
            if("ì ỉ ĩ".contains(x.charAt(i)+"")){
               if(nguyenam.contains(x.charAt(i+1)+""))
                   return false;
               if(phuamkhongdivs_ì.contains(x.charAt(i+1)+""))
                   return false;
            }
        }

        return true;
    }

    public String ShowError() {

        return ("Rule30-31-33:Các nguyên âm được phép sau nguyên âm \"ì\": ìu, ìa, " +
                "Các nguyên âm được phép sau nguyên âm \"ỉ\": ỉu, mỉa," +
                "Các nguyên âm được phép sau nguyên âm \"ĩ\": ĩu, ĩa,");
    }
}
