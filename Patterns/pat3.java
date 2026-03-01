public class pat3 {
    public static void main(String[] args) {
        int row = 5;
        //int col = 5;
        int k;

        for(int i=0; i<row; i++){
            k = 1;
            for(int j=0; j<i+1; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
