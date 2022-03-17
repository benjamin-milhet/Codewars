import java.util.*;
public class Kata {
  public static List filterList(final List list) {
    List res = new ArrayList();
    int i = 0;
    while (i < list.size()) {
      if (!list.toArray()[i].getClass().getSimpleName().equals("String")) {
        res.add(list.toArray()[i]);
      } 
      i++;
    }
    return res;
  }
}