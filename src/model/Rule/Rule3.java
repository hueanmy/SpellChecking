/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

/**
 *
 * @author katie
 */
public class Rule3 extends Rule {

    @Override
    public boolean isValid(String x) {
        String VietnameseCharacters = "qertyuiopasdghklxcvbnm"
                + "èéẹẻẽ" + "ê" + "ềếệểễ"
                + "ùúụủũ" + "ư" + "ừứựửữ"
                + "ìíịỉĩ"
                + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
                + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
                + "đ"
                + "ỳýỵỷỹ"
                ;

        for (int i = 0; i < x.length(); i++) {
            if (!VietnameseCharacters.contains(x.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }

    public String showError() {
        return("chữ cái này không tồn tại trong bảng chữ cái tiếng Việt");
    }
    
}
