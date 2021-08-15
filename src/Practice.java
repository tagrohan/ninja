import java.util.HashSet;
import java.util.Set;

public class Practice {
   public static void main(String[] args) {

      System.out.println(findPairTo(new int[]{6,2, 3, 2, 3}, 4));
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
