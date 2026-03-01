public class pat17 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=0; i<=row; i++){
            for(int j=row-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print((char)(64+j));
            }

            for(int j=i+1; j>=1; j--){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}
