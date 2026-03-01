public class pat18 {
    public static void main(String[] args) {
        int row = 7;
        int temp = 64 + row;
        for(int i=1; i<=row; i++){
            int s = temp;
            for(int j=1; j<=i; j++){
                System.out.print((char)s++);
            }
            temp--;
            System.out.println();
        }
    }
}
