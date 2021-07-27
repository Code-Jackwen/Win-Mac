package ever;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-27 19:43
 **/
public class B {
    //66
    public static void main(String[] args) {
//        String phone = "13123456789";
        String phone = "1352345678A";
        String substring = phone.substring(0, 3);
        System.out.println(substring);
        String[] a1 = {"133","153","180","181","189"};
        String[] a2 = {"130","131","155","185","186"};
        String[] a3 = {"135","136","150","182","188"};

        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[013678])|(18[0,5-9]))\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        boolean isMatch = m.matches();
        if (phone.length() != 11||!isMatch) {
            System.out.println("Illegal format");
        } else {
            //133 153  180 181 189      3、5、8、
            //130 131  155 185 186      3、0、1、9、5、6、2、8
            //135 136  150 182 188
            for (int i = 0; i < a1.length; i++) {
                if (substring.equals(a1[i])){
                    System.out.println("China Telecom");
                }
            }
            for (int i = 0; i < a2.length; i++) {
                if (substring.equals(a2[i])){
                    System.out.println("China Unicom");
                }
            }
            for (int i = 0; i < a3.length; i++) {
                if (substring.equals(a3[i])){
                    System.out.println("China Mobile");
                }
            }

        }
    }

//    public String queryPhoneOperators(String phone) {
//        // write code here
//    }
}
