import java.util.HashSet;
import java.util.Set;

public class Practice {

   public static void main(String[] args) {

   }

   private static int convertToInt(String str) {

      return -1;
   }

   private static String addStarInBtw(String str) {
//      System.out.println(addStarInBtw("aaaaa"));
      if (str.length() == 1) {
         return str;
      }

      char ch = str.charAt(0);
      String half = addStarInBtw(str.substring(1));
      if (ch == half.charAt(0)) {
         return ch + "*" + half;
      }
      return ch + half;
   }


   private static String replaceX(String str) {

      if (str.length() == 0)
         return "";

      char ch = str.charAt(0);
      String res = replaceX(str.substring(1));
      if (ch == 'x') return res;
      else return ch + res;
   }


   private static String replacePi(String str) {
      if (str.length() == 1) {
         return str;
      }
      char ch = str.charAt(0);
      String result = replacePi(str.substring(1));

      if (result.charAt(0) == 'i') {
         if (ch == 'p') {
            return 3.14 + result.substring(1);
         }
      }

      return ch + result;
   }

   private static boolean findPairTo(int[] arr, int k) {
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < arr.length; i++) {
         if (set.contains(k - arr[i])) {
            return true;
         } else {
            set.add(arr[i]);
         }
      }
      return false;
   }
}
