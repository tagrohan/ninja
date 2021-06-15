package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {
   public static void main(String[] args) {
      int[] arr = new int[]{5, 7, 9, 0, 1, 3};
      mergeSort(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
   }

   private static void mergeSort(int[] arr, int start, int end) {
//      int[] arr = new int[]{5, 7, 9, 0, 1, 3};
//      mergeSort(arr, 0, arr.length - 1);
      if (start >= end) {
         return;
      }


      int mid = (start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);

      merge(arr, start, end);
   }

   private static void merge(int[] arr, int start, int end) {
      int mid = (start + end) / 2;
      int i = start, j = mid + 1;
      int k = 0;
      int[] temp = new int[end - start + 1];
      while (i <= mid && j <= end) {
         if (arr[i] <= arr[j]) {
            temp[k] = arr[i];
            i++;
         } else {
            temp[k] = arr[j];
            j++;
         }
         k += 1;
      }
      while (j <= end) {
         temp[k] = arr[j];
         k += 1;
         j += 1;
      }
      while (i <= mid) {
         temp[k] = arr[i];
         i += 1;
         k += 1;
      }
      k = 0;
      for (; start <= end; start++) {
         arr[start] = temp[k];
         k += 1;
      }
   }

   private static List<String> per(String str) {
      if (str.length() == 0) {
         return List.of("");
      }

      char ch = str.charAt(0);
      List<String> current = per(str.substring(1));

      List<String> list = new ArrayList<>();
      for (String s : current) {
         list.add(ch + s);
         list.add("" + s);
      }
      return list;
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
