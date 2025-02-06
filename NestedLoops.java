public class NestedLoops{
    public static void main(String[] args) {
      int n = 3;
      outerLoop : for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
          if(i == 1)break outerLoop;
          System.out.print(j + " ");
        }
        System.out.println();
      }
    }
}