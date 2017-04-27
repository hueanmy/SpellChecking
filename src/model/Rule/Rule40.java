package model.Rule;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class Rule40 extends Rule{
    public String ShowError() {
        return("Rule 40: Cặp nguyên âm ũa chỉ tồn tại trong đũa, dũa");
    }

    public boolean isValid(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("ũ") && (x.charAt(i+1) + "").equalsIgnoreCase("a")) {
                if (i>0 &&(x.charAt(i-1) + "").equalsIgnoreCase("đ")||i>0&&(x.charAt(i-1) + "").equalsIgnoreCase("d")) {
                    return true;
                }  else {
                    return false;
                }
            }
        }
        return true;
    }
}
