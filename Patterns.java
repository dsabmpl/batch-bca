public class Patterns {
  public static void printRightTriangle(int num){
    for(int row = 1;row <= num;row++){
      for(int star = 1;star <= row;star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printPyramid(int num){
    for(int row = 1;row <= num;row++){
      
      for(int star = 1;star <= num - row;star++){
        System.out.print(" ");
      }
      for(int star = 1;star <= 2 * row -1;star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printReversePyramid(int num){
    for(int row = 1;row <= num;row++){

      for(int star = 1;star < row;star++){
        System.out.print(" ");
      }
      
      for(int star = 1;star <= 2 * num - 2 * row + 1;star++){
        System.out.print("*");
      }
      
      System.out.println();
    }
  }

  public static void printRightTriangleWithSpaces(int num){
    for(int row = 1;row <= num;row++){
      
      for(int star = 1;star <= num - row;star++){
        System.out.print(" ");
      }
      for(int star = 1;star <= row;star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printReverseRightTriangleWithSpaces(int num){
    for(int row = 1;row <= num;row++){
      for(int star = 1;star < row;star++){
        System.out.print(" ");
      }
      for(int star = 1;star <= num - row + 1;star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void printReverseRightTriangle(int num){
    for(int row = 1;row <= num;row++){
      for(int star = 1;star <= num - row + 1;star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printSquare(int num){
    for(int row = 1;row<=num;row++){
      for(int star = 1;star<=num;star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int num = 5;
    // printSquare(num);
    // printRightTriangle(num);
    // printReverseRightTriangle(num);
    // printReverseRightTriangleWithSpaces(num);
    // printRightTriangleWithSpaces(num);
    // printPyramid(num);
    printReversePyramid(num);
    

  }
  
}
