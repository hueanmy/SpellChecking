package model.Rule;
/* con error*/
/**
 * Created by katie on 16/03/2017.
 */
public class Rule46 extends Rule{
    @Override
    public boolean isValid(String x) {
        String[] words = {"iữa", "iễu", "iếu", "iều", "iểu", "iêu", "iệu",
                          "iai", "iải", "iới", "iỏi", "iươ", "iườ", "iòi"};
        String word2 = "ữ ễ ế ề ể ê ệ a ả ớ ỏ ư ò";
        String word3 = "a u i ơ ờ ";
        boolean check = false;
        int count = 0;
        String VowelCharacters = "eyuioa"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        for(int i=0;i<x.length();i++){
            if(VowelCharacters.contains(x.charAt(i)+"")){
                count++;
            }
        }
        System.out.println("count" + count);
        if(count==3){
            for(int i=0;i<x.length()-1;i++){
                if("i".contains(x.charAt(i)+"")){
                            check = true;
                            break;
                }
            }
        }
        if(check==true){
            for(String c : words){
               if(x.contains(c)){
                    check = true;
                    break;
                }
                else
                    check = false;
            }
        }

        return check;
    }

    @Override
    public String showError() {
        return ("Các nguyên âm ba có thể xuất hiện được trong tiếng Việt mà nguyên âm đầu tiên là \"i\" " +
                "là: iữa, iễu, iếu, iều, iểu, iêu, iệu, iai, iải, iới, iỏi, iươ, iườ, iòi,");
    }
}
