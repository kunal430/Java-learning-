public class arrayz2D {
    public static void main(String[] args) {
        int a[][] = {  // 2d array
            {1,2},
            {3,4}
        };

        for(int i = 0 ; i < a.length;i ++){    // itrating 2d array
            for (int j = 0 ; j < a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
/* o/p

   1 2 
   3 4
   
*/