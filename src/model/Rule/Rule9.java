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
public class Rule9 extends Rule {

    public String ShowError() {
        return("Rule 9: Nếu một từ có 2 phụ âm cạnh nhau thì phụ âm đó phải là: tr, th, ph, gh, kh, ch, nh, ng");
    }

    public boolean isValid(String x) {
        for (int i = 0; i < x.length(); i++) {
            if (phu_am.contains(x.charAt(i) + "") && i + 1 < x.length() && phu_am.contains(x.charAt(i + 1) + "")) {
                String phuamtruoc = x.charAt(i) + "";
                String phuamsau = x.charAt(i + 1) + "";
                if (phuamsau.equalsIgnoreCase("h")) {
                    if (phuamtruoc.equalsIgnoreCase("t")
                            || phuamtruoc.equalsIgnoreCase("p")
                            || phuamtruoc.equalsIgnoreCase("g")
                            || phuamtruoc.equalsIgnoreCase("k")
                            || phuamtruoc.equalsIgnoreCase("c")
                            || phuamtruoc.equalsIgnoreCase("n")) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (phuamtruoc.equalsIgnoreCase("n") && phuamsau.equalsIgnoreCase("g")) {
                    return true;
                } else if (phuamtruoc.equalsIgnoreCase("t") && phuamsau.equalsIgnoreCase("r")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
