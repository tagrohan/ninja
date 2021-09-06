import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice {

   public static void main(String[] args) {

   }
   private static int[] mergeSort(int[] arr, int start, int end) {
//      System.out.println(Arrays.toString(mergeSort(new int[]{7, 5, 2, 1, 3, 4, 2, 3}, 0, 7)));
      if (start == end) {
         return new int[]{arr[start]};
      }
      int mid = (start + end) / 2;
      int[] firstHalf = mergeSort(arr, start, mid);
      int[] secondHalf = mergeSort(arr, mid + 1, end);
      return mergeSortedArray(firstHalf, secondHalf);
   }
   private static int[] mergeSortedArray(int[] arr, int[] arr2) {
//      mergeSortedArray(new int[]{4, 3, 2, 5, 6}, new int[]{7, 5, 2, 1, 3, 4, 2, 3});
      int len1 = arr.length, len2 = arr2.length;
      int[] sorted = new int[len1 + len2];
      Arrays.sort(arr); // 2 3 4 5 6
      Arrays.sort(arr2);// 1 2 2 3 3 4 5 7
      int ptr1 = 0, ptr2 = 0, pointer = 0;

      while (ptr1 < len1 && ptr2 < len2) {
         if (arr[ptr1] <= arr2[ptr2]) {
            sorted[pointer++] = arr[ptr1++];
         } else if (arr2[ptr2] < arr[ptr1]) {
            sorted[pointer++] = arr2[ptr2++];
         }
      }
      while (ptr1 < len1) sorted[pointer++] = arr[ptr1++];
      while (ptr2 < len2) sorted[pointer++] = arr2[ptr2++];
//      System.out.println(Arrays.toString(sorted));
      return sorted;
   }

   private static String removeX(String str) {
//      System.out.println(removeX("xabxcxax"));
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
