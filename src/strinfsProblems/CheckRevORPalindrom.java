package strinfsProblems;

public class CheckRevORPalindrom {
    public static void main(String[] args) {
        String s1 = " mam";
        String revs = "";
        for (int i = s1.length() - 1; i >= 0; i--) {

            revs = revs + s1.charAt(i);

        }
        System.out.println(revs);
//REves of string ^

        //palindrom ->

        if (s1.equals(revs)){
            System.out.println(" it is palindrom ");
        }else {
            System.out.println("not pAlindrom ");
        }
    }
}
