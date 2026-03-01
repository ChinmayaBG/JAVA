import java.io.IOException;

public class noOfDigits{

    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());   
        System.out.println(countDigits(2002444));
    }
}