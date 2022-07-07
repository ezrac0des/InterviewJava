
//EZRA
public class Day04_SubstringsInAWord {

    //Take all substrings from a String
    public static void main(String args[]) {
        substrings("java");
    }

    public static void substrings(String str) {
        System.out.println("All substrings of the string are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

}
