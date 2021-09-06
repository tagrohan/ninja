import java.util.HashSet;
import java.util.Set;

public class Practice {

   public static void main(String[] args) {
      System.out.println(removeX("xabxcxax"));
   }

   private static String removeX(String str) {
      if (str.length() == 0) return "";

      char ch = str.charAt(0);
      String cStr = removeX(str.substring(1));
      if (ch == 'x') {
         return cStr;
      }
      return ch + cStr;
   }

   private static int convertToInt(String str) {
//      System.out.println(convertToInt("00001203"));
      if (str.length() == 1) {
         return Integer.parseInt(str);
      }
      char ch = str.charAt(0); // 2
      int val = convertToInt(str.substring(1)); // 3

      return (ch - '0') * (int) Math.pow(10, str.length() - 1) + val;

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
