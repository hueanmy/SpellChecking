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

//Các nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên 
//là "u" gồm: uôi, uối, uồi, uỗi, uội, uổi, uai (phải đi với q), quái, quại, quay, 
//quẩy, quậy, quầy, uây (đi được với q và kh), uấy (đi kèm với q và kh), quẫy, uya, 
//uỷu (đi với kh)
public class Rule42 extends Rule {

    public String ShowError() {
        return("Rule 42: 3 nguyên âm đứng cạnh nhau không hợp lệ!");
    }

    public boolean isValid(String x) {
        for (int j = 0; j < x.length(); j++) {
            if ((x.charAt(j) + "").equalsIgnoreCase("u") && j+2<x.length()
                    && (nguyenam.contains(x.charAt(j + 1) + ""))
                    && (nguyenam.contains(x.charAt(j + 2) + ""))) {
                if ((x.charAt(j + 1) + "").equalsIgnoreCase("ô") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uôi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ố") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uối
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ồ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uồi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ộ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uội
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ổ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uổi
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("a") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uai
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("á") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uái
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ạ") && (x.charAt(j + 2) + "").equalsIgnoreCase("i")) { //uại
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("à") && (x.charAt(j + 2) + "").equalsIgnoreCase("o")) { //uào
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("a") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { //uay
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ẩ") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { //uẩy
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ầ") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { // uầy
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("â") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { // uây
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ẫ") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { // uẫy
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ấ") && (x.charAt(j + 2) + "").equalsIgnoreCase("y")) { // uấy
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("a")) { // uya
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ỷ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { // uỷu 
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("ề")) { // uyề
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("ế")) { // uyế
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("ê")) { // uyê
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("ể")) { // uyể
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("ệ")) { // uyệ
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("y") && (x.charAt(j + 2) + "").equalsIgnoreCase("ễ")) { // uyễ
                    return true;
                } else if ((x.charAt(j + 1) + "").equalsIgnoreCase("ỵ") && (x.charAt(j + 2) + "").equalsIgnoreCase("u")) { // uỵu
                    return true;
                } else {
                    return false;
                }

            }

        }
        return true;
    }
}
