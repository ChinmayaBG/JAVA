public class pat16 {
    public static void main(String[] args) {
        int row = 5;
        int temp = 65;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)temp);
            }
            System.out.println();
            temp++;
        }
    }
}
