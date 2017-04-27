package model.Rule;



public class Rule12 extends Rule {

    @Override
    public boolean isValid(String x) {
        String lastC = x.length()>0?(x.charAt(x.length() - 1) + ""):"";
        if (lastC.equalsIgnoreCase("q")
                || lastC.equalsIgnoreCase("v")
                || lastC.equalsIgnoreCase("b")
                || lastC.equalsIgnoreCase("d")
                || lastC.equalsIgnoreCase("l")
                || lastC.equalsIgnoreCase("k")
                || lastC.equalsIgnoreCase("s")
                || lastC.equalsIgnoreCase("x")
                || lastC.equalsIgnoreCase("r")
                || lastC.equalsIgnoreCase("đ")) {
            return false;
        }
        return true;
    }

	@Override
    public String showError() {
        return ("Các nguyên âm trong từ phải đứng cạnh nhau, không có phụ âm chen vào giữa");
    }

}
