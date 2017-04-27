/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

import static model.Rule.Define_Character.nguyenam;

/**
 *
 * @author katie
 */
public class Rule47 extends Rule {

    public String ShowError() {
        return "Rule 47: Trước phụ âm CH không được là nguyên âm không dấu có dấu huyền hoặc ngã";
    }

    public boolean isValid(String x) {
        String list_huyen_nga = "eèẽêềễuùũưừữiìĩoòõôồỗơờỡaàãầẫằẵ";
        if (x.length() > 3) {
            if ((x.charAt(x.length() - 1) + "").equalsIgnoreCase("h") && (x.charAt(x.length() - 2) + "").equalsIgnoreCase("c")) {
                if (list_huyen_nga.contains(x.charAt(x.length() - 3) + "")) {
                    return false;
                }
            }
        }
        return true;
    }

}
