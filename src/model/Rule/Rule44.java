package model.Rule;

import static model.Rule.Define_Character.nguyenam;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luc Hoang
 */
//Các nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên là "o" gồm: 
//oai, oài, oái, oải, oại  (oãi thì gần như không thấy), oay (chỉ đi với x), 
//oáy (đi với x và ng), oẹo (đi với ng)
public class Rule44 extends Rule {

    public String ShowError() {
        return("Rule 44: 3 nguyên âm đứng cạnh nhau không hợp lệ!");
    }

    public boolean isValid(String x) {
        for (int j = 0; j < x.length(); j++) {
            if ((nguyenam.contains(x.charAt(j) + ""))
                    && j+2<x.length()
                    && (x.charAt(j) + "").equalsIgnoreCase("o")
                    && (nguyenam.contains(x.charAt(j + 1) + ""))
                    && (nguyenam.contains(x.charAt(j + 2) + ""))) {
                if ((x.charAt(j + 1) + "").equalsIgnoreCase("a") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //oai
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("à") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //oài
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ả") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //oải
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ạ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //oại
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("á") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //oái
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("a") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { //oay
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("á") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { //oáy
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ẹ") && (x.charAt(j + 2) + "").equalsIgnoreCase("o")) { //oẹo
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("è") && (x.charAt(j + 2) + "").equalsIgnoreCase("o")) { //oèo
                    return true;
                }  else {
                    return false;
                }

            }

        }
        return true;
    }
}
