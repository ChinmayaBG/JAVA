public class pat22 {
    public static void main(String[] args) {
        int row = 4;
        for(int i=0; i<2*row-1; i++){
            for(int j=0; j<2*row-1; j++){
                int top = i;
                int left = j;
                int right = (2*row-2) - left;
                int down = (2*row-2) - top;
                int temp1 = Math.min(top, left);
                int temp2 = Math.min(down, right);
                int ans = Math.min(temp1, temp2);
                System.out.print(row - ans);
            }
            System.out.println();
        }
    }
    
}
