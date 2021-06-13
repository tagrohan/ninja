package recursion;

public class Assignment1 {
   public static void main(String[] args) {
      System.out.println(convert("00012302"));
   }

   private static int convert(String arr) {
//      System.out.println(convert("00012302"));
//      for (int i = 0; i < arr.length(); i++) {
//         if (arr.charAt(i) != '0') {
//            return convertStringToInt(arr.substring(i));
//         }
//      }
      return convertStringToInt(arr);
   }

   private static int convertStringToInt(String arr) {
      if (arr.length() == 1) {
         return Integer.parseInt(arr);
      }
      char ch = arr.charAt(0);

      return (int) ((ch - '0') * Math.pow(10, arr.length() - 1) + convertStringToInt(arr.substring(1)));
   }

   private static String replacePi(String str) {
//      System.out.println(replacePi("pixpixp"));
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
