public class pat11 {
    public static void main(String[] args) {
        int row = 5;
        //int col = 5;
        int start;

        for(int i=0; i<row; i++){
            if(i%2 == 0)
                start = 1;
            else
                start = 0;
            for(int j=0; j<i+1; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
