// square pattern in java
class Main11{
    public static void main(String args[]){
       int n = 5;

       for (int i = 1;i <=n;i++){            // outer loop always talks about rows
        for (int j = 1;j<=n;j++){
            System.out.print("*");      // only print here , as we need j to print continuously without going to new line
        }
        System.out.println();
       }  
      }
}