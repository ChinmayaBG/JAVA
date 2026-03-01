public class pat10 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        for(int i=0; i<row; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<row; i++){
            for(int j=0; j<col-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
