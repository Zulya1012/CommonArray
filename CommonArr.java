public class CommonArr {

  public static void main(String[] args) {

    int[] arr1 = {
      1,
      2,
      5,
      6,
      5,
      7,
      10
    };
    int[] arr2 = {
      10,
      0,
      6,
      2,
      8,
      4,
      7
    };

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == (arr2[j])) {
          System.out.println("Common element : " + (arr1[i]));
        }

      }
    }

  }
}
