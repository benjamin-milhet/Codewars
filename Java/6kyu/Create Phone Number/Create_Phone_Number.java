public class Kata {
    public static String createPhoneNumber(int[] numbers) {
      String res = ""; //Initialisation de la variable de retour
      res += "(";
      for (int i = 0 ; i < numbers.length ; i++) { //On parcours le tableau d'entre
        res += numbers[i];
        if (i == 2) res += ") ";
        if (i == 5) res += "-";
      }
  
      return res;
    }
  }