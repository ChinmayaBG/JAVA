public class prac{
    public static void main(String[] args){
        int row = 5;
        int col = 5;

        for(int i=0; i<row; i++){
            //int k = 1;
            for(int j=0; j<i; j++){
                System.out.print(" ");;               
            }
            for(int m=0; m<(2*row)-(2*i)-1; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}