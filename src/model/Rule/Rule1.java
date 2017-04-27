package model.Rule;

/**
 * Created by katie on 05/03/2017.
 */
public class Rule1 extends Rule {
    @Override
    public boolean isValid(String x) {
        String firstConstants = "q s d đ k l x v b";
        for (int i = 1; i < x.length(); i++) {
            if (firstConstants.contains(x.charAt(i) + "")) {
                return false;
            }

        }
        return true;
    }

    @Override
    public String showError() {
        return ("Có một số phụ âm chỉ được phép đứng đầu từ: q, s, d, đ, k, l, x, v, b");
    }
}
