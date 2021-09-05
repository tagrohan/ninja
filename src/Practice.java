import java.util.HashSet;
import java.util.Set;

public class Practice {
   public static void main(String[] args) {

      System.out.println(replacePi("pip")); // 3.143.14
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
