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
 * 
 */
public class Rule11 extends Rule{

    public String ShowError() {
        return "Rule 11: Trước P không được có nhiều hơn 1 nguyên âm";
    }

    public boolean isValid(String x) {
        return true;
    }
    
}
