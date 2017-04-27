package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule13 extends Rule {
    @Override
    public boolean isValid(String x) {
	String lastC = x.length()>1?x.charAt(x.length()-1)+"":"";
        String nearLastC = x.length()>1?x.charAt(x.length()-2)+"":"";
        if(lastC.equalsIgnoreCase("h")){
            if(nearLastC.equalsIgnoreCase("n")||nearLastC.equalsIgnoreCase("c")){
                return true;
            } return false;
        } else if(lastC.equalsIgnoreCase("g")){
            if(nearLastC.equalsIgnoreCase("n")){
                return true;
            } else return false;
        }
//        boolean check = false;
//        String consonants = "h g";
//        if(x.endsWith(consonants)) {
//            check = true;
//        }
//        if(check=true){
//            if(!"n c".contains(x.charAt(x.length()-2)+"")){
//                if("h".contains(x.charAt(x.length()-1)+""))
//                    check = false;
//            }
//            if(!"n".contains(x.charAt(x.length()-2)+"")){
//                if("g".contains(x.charAt(x.length()-1)+""))
//                    check = false;
//            }
//        }
        return true;
    }

    @Override
    public String showError() {
        return ("Rule13:\tmột số phụ âm được phép đứng cuối:nh, ch, ng");
    }
}
