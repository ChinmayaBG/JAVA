//In interfaces all methods are by default public abstract and variables will be static and final
//All inner classes in interface are static by default

interface A{
    void show();
    static int age = 50;
    class C{
        public void config(){
            System.out.println("In config");
        }
    }
}

class B implements A{
    public void show(){
        System.out.println("In B show");
    }
}


public class interFace {
    public static void main(String[] args) {
        //creating an instance of inner class of interface A
        A.C obj1 = new A.C();
        obj1.config();

        B obj = new B();
        obj.show();

        //Anonymus inner class
        A obj2 = new A()
        {
            public void show(){
                System.out.println("In obj2 show");
            }
        };
        obj2.show();
    }
}
