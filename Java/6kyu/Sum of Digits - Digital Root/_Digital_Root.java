public class DRoot {
    public static int digital_root(int n) {
      int res = 0;
      while(n > 0){
        res += (n%10);
        n = n/10;
      }
      if(res > 9) res = digital_root(res);
      return res;
    }
  }