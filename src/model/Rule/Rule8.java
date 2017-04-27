package model.Rule;

/**
 * Created by katie on 11/03/2017.
 */
public class Rule8 extends Rule {
    @Override
    public boolean isValid(String x) {
        String character = "c";
        String constants  = "qrtypsdgklxcvbnmđh";
        String nguyeam = "eyuioa"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        boolean check = false;
        if("c".contains(x.charAt(0)+"")) {
            if (constants.contains(x.charAt(1) + "")) {
                check = true;
            }
            else {
                return true;
            }
        }
        if(check = true){
            if(!"h".contains(x.charAt(1)+"")) {
                check = false;
            }
        }
        return check;
    }

    @Override
    public String showError() {
        return ("Nếu một từ có phụ âm c đứng đầu thì phụ âm sau nó (nếu có) phải là H");
    }
}
