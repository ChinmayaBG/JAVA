public class pat15 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1; i<=row; i++){
            int num = 65;
            for(int j=row-i+1; j>=1; j--){
                System.out.print((char)num++);
            }
            System.out.println();
        }
    }

}
