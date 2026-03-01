abstract class A{
    public abstract void show();

    int age;

    public void add(int a, int b){
        System.out.println(a + b);
    }

    class C{
        public void config(){
            System.out.println("In Config");
        }
    }

    static class D{
        public void config(){
            System.out.println("In static class Config");
        }
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class abstractClasses {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.add(9, 12);

        //Creating object of non static inner class
        A.C obj1 = obj.new C();
        obj1.config();

        //Creating object of static inner class
        A.D obj2 = new A.D();
        obj2.config();

        //Anonymous inner class
        A obj3 = new A()
        {
            public void show(){
                System.out.println("In obj3 show");
            }
        };

        obj3.show();
        obj3.add(4, 5);

    }
}
