
//BERNA
public class Day06_ReverseString {

    // There is no reverse funtion on String. Because string is immutable
    public static void main(String[] args) {
        String s = "Selenium";
        int len = s.length();//8
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        // Second way with String Buffer
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());

        // Third way with String Buffer
        StringBuilder sbi = new StringBuilder(s);
        System.out.println(sbi.reverse());
    }

}
