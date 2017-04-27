package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule39AB extends Rule {
    @Override
    public boolean isValid(String x) {
        String check = "aàáảãạặăắ";
        String check2 = "iìíỉĩị";
        String check3 = "eèéẻẽẹ";
        if (vowelsCount(x) == 2) {
            for (int i = 0; i < x.length() - 1; i++) {
                if ((x.charAt(i) + "").equalsIgnoreCase("o") && nguyenam.contains(x.charAt(i + 1) + "")) {
                    if (check.contains(x.charAt(i + 1) + "")
                            || check2.contains(x.charAt(i + 1) + "")
                            || check3.contains(x.charAt(i + 1) + "")) {
                        return true;
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("o")) {
                        if ((x.equalsIgnoreCase("xoong")) || (x.equalsIgnoreCase("boong"))) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ẵ")) {
                        if ((x.equalsIgnoreCase("hoẵng"))) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ă")) {
                        if ((x.equalsIgnoreCase("thoăn"))||(x.equalsIgnoreCase("xoăn"))) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ắ")) {
                        if ((x.equalsIgnoreCase("hoắt"))||x.equalsIgnoreCase("thoắt")) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String showError() {

        return ("Rule39AB:\tNguyên âm sau \"o\" để tạo thành cặp nguyên âm: \"oa\", \"oi\", \"oe\","
		+ "Cặp nguyên âm \"oo\" chỉ có thể thuộc về xoong, boong");
    }
}
