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
public class Rule41 extends Rule {


    public String ShowError() {
        return("Rule 41: 3 nguyên âm đứng cạnh nhau không hợp lệ!");
    }

    public boolean isValid(String x) {
        for (int j = 0; j < x.length(); j++) {
            if ((nguyenam.contains(x.charAt(j) + ""))
                    && (x.charAt(j) + "").equalsIgnoreCase("i")
                    && j+2<x.length()
                    && (nguyenam.contains(x.charAt(j + 1) + ""))
                    && (nguyenam.contains(x.charAt(j + 2) + ""))) {
                if ((x.charAt(j + 1) + "").equalsIgnoreCase("ữ") && (x.charAt(j + 2) + "").equalsIgnoreCase("a")) { //iữa
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ễ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //iễu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ế") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //iếu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ề") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //iều
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ể") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //iểu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ê") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //iêu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ệ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { //iệu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("a") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //iai 
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ả") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { // iải
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ớ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { // iới
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ỏ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { // iỏi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ư") && (x.charAt(j + 2) + "").equalsIgnoreCase("ơ")) { // iươ
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ư") && (x.charAt(j + 2) + "").equalsIgnoreCase("ờ")) { // iườ
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ò") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { // iòi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("a") && (x.charAt(j + 2) + "").equalsIgnoreCase("o")) { // iao
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("á") && (x.charAt(j + 2) + "").equalsIgnoreCase("o")) { // iáo
                    return true;
                }  else if ((x.charAt(j + 1) + "").equalsIgnoreCase("à") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { // iàu
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ã") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { // iãy
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ụ") && (x.charAt(j + 2) + "").equalsIgnoreCase("a")) { // iụa
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("â") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { // giây
                    return true;
                } else {
                    return false;
                }

            }

        }
        return true;
    }
}
