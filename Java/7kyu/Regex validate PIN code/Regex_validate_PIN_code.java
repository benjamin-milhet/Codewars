import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

  public static boolean validatePin(String pin) {
    System.out.println(pin);
    if(pin.length() == 4 || pin.length() == 6) {
      Pattern p = Pattern.compile("\\d{" + pin.length() + "}");
      Matcher m = p.matcher(pin);
      return m.find();
    } else return false;
  }
}