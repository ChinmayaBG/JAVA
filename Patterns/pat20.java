public class pat20 {
    public static void main(String[] args) {
        int row = 5;
        int space = 2*row;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=space-2; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            space = space - 2;
            System.out.println();
        }
        for(int i=1+1; i<=row; i++){
            for(int j=1; j<=row+1-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*i-2; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=row+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
