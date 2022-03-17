import java.util.*;   

public class PangramChecker {
  public boolean check(String sentence){
    boolean res = false;
    ArrayList<Character> alpha = new ArrayList<>();
    for(int i = 0 ; i < sentence.length() ; i++) {
      if(Character.toLowerCase(sentence.charAt(i)) > 96 && Character.toLowerCase(sentence.charAt(i)) < 123){
          if(!alpha.contains(Character.toLowerCase(sentence.charAt(i)))) alpha.add(Character.toLowerCase(sentence.charAt(i)));
      }
    }
    if(alpha.size() == 26) res = true;
    return res;
  }
}