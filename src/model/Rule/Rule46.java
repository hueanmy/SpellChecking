package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;

/* con error*/
/**
 * Created by katie on 16/03/2017.
 */
public class Rule46 extends Rule{
    @Override
    public boolean isValid(String x) {
      if (vowelsCount(x) == 3) {
            for (int i = 0; i < x.length() - 2; i++) {
                if ((x.charAt(i) + "").equalsIgnoreCase("i") && nguyenam.contains(x.charAt(i + 1) + "") && nguyenam.contains(x.charAt(i + 2) + "")) {
                    if (((x.charAt(i + 1) + "").equalsIgnoreCase("ữ") && (x.charAt(i + 2) + "").equalsIgnoreCase("a"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("â") && (x.charAt(i + 2) + "").equalsIgnoreCase("y"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ấ") && (x.charAt(i + 2) + "").equalsIgnoreCase("y"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("à") && (x.charAt(i + 2) + "").equalsIgnoreCase("y"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ấ") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ễ") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ế") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ề") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ể") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ê") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ệ") && (x.charAt(i + 2) + "").equalsIgnoreCase("u"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("a") && (x.charAt(i + 2) + "").equalsIgnoreCase("i"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ả") && (x.charAt(i + 2) + "").equalsIgnoreCase("i"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("á") && (x.charAt(i + 2) + "").equalsIgnoreCase("o"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ả") && (x.charAt(i + 2) + "").equalsIgnoreCase(""))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("a") && (x.charAt(i + 2) + "").equalsIgnoreCase("o"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ớ") && (x.charAt(i + 2) + "").equalsIgnoreCase("i"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ỏ") && (x.charAt(i + 2) + "").equalsIgnoreCase("i"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ư") && (x.charAt(i + 2) + "").equalsIgnoreCase("ơ"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ư") && (x.charAt(i + 2) + "").equalsIgnoreCase("ờ"))
                            || ((x.charAt(i + 1) + "").equalsIgnoreCase("ò") && (x.charAt(i + 2) + "").equalsIgnoreCase("i"))) {
                        return true;
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
        return ("Rule46:\tCác nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên là \"i\" là: iữa, iễu,                  iếu, iều, iểu, iêu, iệu, iai, iải, iới, iỏi, iươ, iườ, iòi,");
    }
}
