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
public class Rule10 extends Rule {

    public String ShowError() {
        return ("Rule 10: Nếu có 3 phụ âm cạnh nhau thì nó phải là ngh");
    }

    public boolean isValid(String x) {
        String phuam1 = "";
        String phuam2 = "";
        String phuam3 = "";
        for (int i = 2; i < x.length(); i++) {
            phuam1 = x.charAt(i - 2) + "";
            phuam2 = x.charAt(i - 1) + "";
            phuam3 = x.charAt(i) + "";
            if (phu_am.contains(phuam1) && phu_am.contains(phuam2) && phu_am.contains(phuam3)) {
                String phuamliennhau = phuam1 + phuam2 + phuam3;
                if (!phuamliennhau.equalsIgnoreCase("ngh")) {
                    return false;
                }
            }
        }
        return true;
    }

}
