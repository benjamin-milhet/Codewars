public class FindOutlier{
    static int find(int[] integers){
      int res = 0;
      int odd = 0;
      int even = 0;
      int nbOdd = 0;
      int nbEven = 0;
      for(int i = 0; i < integers.length ; i++){
        if(integers[i]%2 == 0){
          even = integers[i];
          nbEven++;
        } else {
           odd = integers[i];
           nbOdd++;
        }
      }
      if(nbOdd > 1) res = even;
      if(nbEven > 1) res = odd;
      return res;
  }
}