public class pat6 {
    public static void main(String[] args) {
        
    int row = 5;
        int col = 5;

        for(int i=0; i<row; i++){
            int k = 1;
            for(int j=0; j<col-i; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
