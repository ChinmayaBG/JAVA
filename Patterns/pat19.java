public class pat19 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1; i<=row; i++){
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
        for(int i=row; i>=1; i--){
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
