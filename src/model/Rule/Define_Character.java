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
public class Define_Character {

	public static String lowCharactor = "eyuioa" + "èéẹẻẽ" + "ê" + "ềếệểễ" + "ùúụủũ"
		+ "ư" + "ừứựửữ" + "ìíịỉĩ" + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
		+ "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ" + "ỳýỵỷỹ";
	public static String nguyenam = lowCharactor + lowCharactor.toUpperCase();
	public static String phu_am = "qrtpsdghklxcvbnm" + "đ";
	public static String specialCharactor = ":!,.?-”“;!?*!\".–+" + "'" + '"' + "()" + "" + "0123456789";
	public static String VietnameseCharacters = "qertyuiopasdghklxcvbnm" + "èéẹẻẽ" + "ê" + "ềếệểễ" + "ùúụủũ"
		+ "ư" + "ừứựửữ" + "ìíịỉĩ" + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
		+ "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ" + "đ" + "ỳýỵỷỹ";
	public static String VietnameseVowels = "èéẹẻẽ" + "ê" + "ềếệểễ"
                + "ùúụủũ" + "ư" + "ừứựửữ"
                + "ìíịỉĩ"
                + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
                + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
                + "ỳýỵỷỹ"
                ;
	
	public static int vowelsCount(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (nguyenam.contains(x.charAt(i) + "")) {
				count++;
			}
		}
		return count;
	}
	public static String vowel18 ="eau"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        public static String consonants18 = "q r s d g h k l v b x t p c đ";
	public static String nguyenamsau_i = "yio"
            + "èéẹẻẽ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        public static String phuamkhongdivs_i = "q r t p s d g h k l x c v đ b";
	

}
