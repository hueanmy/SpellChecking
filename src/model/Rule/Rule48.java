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
public class Rule48 extends Rule {

    String list = "eéèẽẹẻuúùũụủoóòõọỏưứừữựửôốồỗộổơớờỡợở";
    boolean ch = false;
    boolean nh = false;

    public String ShowError() {
        return "Rule 48: Trước CH và NH không được có âm u, o, e, y";
    }

    public boolean isValid(String x) {
        if (x.length() > 3) {
            if ((x.charAt(x.length() - 1) + "").equalsIgnoreCase("h")
                    && ((x.charAt(x.length() - 2) + "").equalsIgnoreCase("c") || (x.charAt(x.length() - 2) + "").equalsIgnoreCase("n"))) {
                if (list.contains(x.charAt(x.length() - 3) + "")) {
                    return false;
                }
            }
        }
        return true;
    }

}
