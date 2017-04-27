package model.Rule;

import static model.Rule.Define_Character.phu_am;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author katie
 */
public class Rule45 extends Rule {

    public String ShowError() {
        return ("Rule 45: Trước y không được là phụ âm ngoại trừ v, t, h, k, m và l");
    }

    public boolean isValid(String x) {
        String to_hop_am_y = "yýỳỷỵỹ";
        String list = "vthkml";
        for (int i = 1; i < x.length(); i++) {
            if (to_hop_am_y.contains(x.charAt(i) + "") && phu_am.contains(x.charAt(i - 1) + "")) {
                if (list.contains(x.charAt(i - 1) + "")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
