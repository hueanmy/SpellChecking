package model.Rule;

/**
 * Created by katie on 13/03/2017.
 */
public class Rule11 extends Rule {
    @Override
    public boolean isValid(String x) {
        String vowels = "éẹ" + "ếệ" + "úụ"  + "ứự" + "íị" + "óọ"
                        +"ốộ" + "ớợ" + "áạ"  + "ấậ" + "ắặ" + "ýỵ";
        String con = "t c p";
        boolean check1 = false;
        boolean check2 = false;
        for(int i=1;i<x.length()-1;i++){
            if(con.contains(x.charAt(i)+""))
                check1 = true;
            else if("c".contains(x.charAt(i)+"")){
                if("h".contains(x.charAt(i+1)+""))
                    check2=true;
            }
        }
        if(check1=true){
            for(int i =0;i<x.length()-1;i++){
                if(!vowels.contains(x.charAt(i)+"")){
                    if(con.contains(x.charAt(i+1)+""))
                        return false;
                }
            }
        }
        if(check2=true){
            for(int i=0;i<x.length()-1;i++){
                if(!vowels.contains(x.charAt(i)+"")){
                    if("c".contains(x.charAt(i+1)+""))
                        if("h".contains(x.charAt(i+2)+""))
                            return false;
                }
            }
        }

        return true;
    }

    public String showError() {
        return ("Rule11:\tCó một số phụ âm được phép đứng cuối nhưng nó phải đi kèm với một phụ âm khác:nh, ch, ng,");
    }
}
