import java.util.*;
import java.util.stream.*;

public class WeightSort {
  
  public static String orderWeight(String strng) {
    List<String> s = Arrays.asList(strng.split(" "));
    Collections.sort(s, new Comparator<String>() {
      public int compare(String o1, String o2) {
        int diff = getSum(o1) - getSum(o2);
        return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
      } 
    });
    return String.join(" ", s);
  }
  
   private static int getSum(String s) {
   int sum = 0;
    for(String d: s.split("")) {
      sum += Integer.parseInt(d); 
    }
    return sum; 
  }
}