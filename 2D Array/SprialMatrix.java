public class SprialMatrix {
    public static void printsprial(int matrix[][]){
        int startrow =0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while (startrow<=endrow && startcol <= endcol){
             // top
            for(int j = startcol;  j<=endcol; j++ ){
                System.out.println(matrix[startrow][j]+ " ");
            }

            // right

        }


    }

    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
    }

}
