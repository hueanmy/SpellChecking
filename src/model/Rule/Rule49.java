/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

public class Rule49 extends Rule {

    String list_khong_dau = "aăâeêyuưioôơ";

    @Override
    public boolean isValid(String x) {
        if (x.length() > 1) {
            for (int i = 1; i < x.length(); i++) {
                if ((x.charAt(i) + "").equalsIgnoreCase("c")) {
                    if (list_khong_dau.contains(x.charAt(i - 1) + "")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

	@Override
	public String showError() {

        return ("Rule49:\tCác nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên là \"o\" gồm: oai, oài,			oái, oải, oại oãi thì gần như không thấy), oay (chỉ đi với x), oáy (đi với x và ng), oẹo (đi với ng), ");
	}
}