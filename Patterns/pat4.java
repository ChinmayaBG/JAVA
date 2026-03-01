public class pat4 {
    public static void main(String[] args) {
        int row = 5;
        //int col = 5;

        for(int i=0; i<row; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
