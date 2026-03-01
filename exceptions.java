///Exceptions stop the program execution then and there only hence we should handle them
class bgException extends Exception{
    public bgException(String str){
        super(str);
    }
}

public class exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 18;
        int nums[] = new int[5];
        String name = null;

        try{
            System.out.println(name.length());
            System.out.println(nums[5]);
            j = j / i;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in ur limit");
        }

        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }

        catch(Exception e){
            System.out.println("Something went wrong "+ e);
        }

        try {
            //creating our own exception
            if(i == 0)
                throw new bgException("Division by zero");
        } catch (bgException e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        System.out.println("Bye");
    }
}
