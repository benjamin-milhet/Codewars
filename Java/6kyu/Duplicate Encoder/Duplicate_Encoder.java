import org.apache.commons.lang3.StringUtils;

public class DuplicateEncoder {
  static String encode(String word){
    String res = "";
    for(int i = 0 ; i < word.length() ; i++) {
      if(StringUtils.countMatches(word.toUpperCase(), Character.toUpperCase(word.charAt(i))) > 1) res += ")";
      else res += "(";
    }
    return res;
  }
}