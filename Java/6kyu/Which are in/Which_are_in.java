import java.util.*;

public class WhichAreIn { 
  
  public static String[] inArray(String[] array1, String[] array2) {
    ArrayList<String> res = new ArrayList<>();
    for(int i = 0 ; i < array1.length ; i++){
      for(int j = 0 ; j < array2.length ; j++) if(array2[j].contains(array1[i])) res.add(array1[i]); 
    }
    Collections.sort(res);
    return res.stream().distinct().toArray(String[]::new);
  }
}