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

//Các nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên là "ư" gồm: 
//ươi, ười, ưới, ưỡi, ưởi, ượi, ượu, ườu, ươu, ướu,
public class Rule43 extends Rule {

    public String ShowError() {
        return("Rule 43: 3 nguyên âm đứng cạnh nhau không hợp lệ!");
    }

    public boolean isValid(String x) {
        for (int j = 0; j < x.length(); j++) {
            if ((nguyenam.contains(x.charAt(j) + ""))
                    && j+2<x.length()
                    && (x.charAt(j) + "").equalsIgnoreCase("ư")
                    && (nguyenam.contains(x.charAt(j + 1) + ""))
                    && (nguyenam.contains(x.charAt(j + 2) + ""))) {
                if ((x.charAt(j + 1) + "").equalsIgnoreCase("ơ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //ươi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ờ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //ười
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ớ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //ưới
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ỡ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //ưỡi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ở") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //ưởi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ợ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //ượi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ợ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //ượu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ờ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //ườu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ơ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { // ươu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ớ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { // ướu
                    return true;
                } else {
                    return false;
                }

            }

        }
        return true;
    }
}
