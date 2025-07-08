public class diagonalarrow {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {3, 4, 5 ,6}};
            //row
            for (int row =arr.length-1; row >=0; row--){
                int r=row;
                int c=0;
                while(rr<arr.length && c<arr[0].length){
                    System.out.print(arr[r][c]+" ");
                    r++;
                    c++;
                    
                }
            }
        };


    }
}