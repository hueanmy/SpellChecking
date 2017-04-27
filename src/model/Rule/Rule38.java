package model.Rule;

import static model.Rule.Define_Character.nguyenam;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class Rule38 extends Rule {

    public String ShowError() {
        return("Rule 38: Đi sau nguyên âm u là i í a ẻ ê ề ệ ế ể e è é ẹ ơ á ả ạ à ã y ỵ ý ỹ ỷ ỳ â ấ ậ ầ ẫ ă ặ ắ ở ô ổ ố ộ ồ ỗ â ẩ");
    }

    public boolean isValid(String x) {
        String list ="iíaãẻéẹêềểởếệeèơáảạàộyỵýỳỹỷâấậầẫôốộổồỗâẩặắ ă";
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("u") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if (list.contains(x.charAt(i+1)+"")) {
                    return true;
                }  else {
                    return false;
                }
            }
        }
        return true;
    }
}
