package recursion;

public class Assignment1 {
   public static void main(String[] args) {
      System.out.println(replacePi("pixpixp"));
   }

   private static String replacePi(String str) {

      if (str.length() == 0) {
         return "";
      }

      char ch = str.charAt(0);
      String current = replacePi(str.substring(1));

      if (ch == 'p' && current.length() > 1 && current.charAt(0) == 'i') {
         return 3.14 + current.substring(1);
      }
      return ch + current;
   }
}
