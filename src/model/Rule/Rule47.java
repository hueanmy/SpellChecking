/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;


/**
 *
 * @author Luc Hoang
 */
public class Rule47 extends Rule {


    @Override
    public boolean isValid(String x) {
        String list_huyen_nga = "eèẽêềễuùũưừữiìĩoòõôồỗơờỡaàãầẫằẵ";
        if (x.length() > 3) {
            if ((x.charAt(x.length() - 1) + "").equalsIgnoreCase("h") && (x.charAt(x.length() - 2) + "").equalsIgnoreCase("c")) {
                if (list_huyen_nga.contains(x.charAt(x.length() - 3) + "")) {
                    return false;
                }
            }
        }
        return true;
    }

	@Override
	public String showError() {
		return ("Rule47:\tCác nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên là \"u\" gồm: u                         ôi, uối, uồi, uỗi, uội, uổi, uai (phải đi với q), quái, quại, quay, quẩy, quậy, quầy,  uây (đi được vớ                         i q và kh), uấy (đi kèm với q và kh), quẫy, uya, uỷu (đi với kh)");
	}

}
