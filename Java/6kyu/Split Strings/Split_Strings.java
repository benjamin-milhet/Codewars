public class StringSplit {
    public static String[] solution(String s) {
      String[] res = new String[s.length()/2+s.length()%2];
      int ii = 0;
      for(int i = 0; i < s.length(); i+=2){
          String j = s.charAt(i) + "";
          if(i != s.length()-1) j += s.charAt(i+1);
          else if (s.length()%2 !=0) j+= "_";
          res[ii] = j;
          ii++;
      }
      return res;
    }
}