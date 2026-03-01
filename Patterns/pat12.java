public class pat12 {
    public static void main(String[] args) {
        int row = 5;
        int space = 2 * (row - 1);
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=1; j<space; j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            space = space - 2;
            System.out.println();
        }
    }
}
