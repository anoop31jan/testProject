public class DemoTest implements  A1,A2 {



    static {
        System.out.println("static block");
    }

    public  DemoTest(){

        System.out.println("constructor block");
}

    {
        System.out.println("init block");

    }
    public static void main(String[] args) {

        DemoTest demoTest = new DemoTest();
       // demoTest.display();

        {
            System.out.println("inside static method block");
        }

    }

    public void display(){

        System.out.println("display");
        A2.super.print();
    }


}


interface A1{

    default void show(){
        System.out.println("  A! inteface");

    }

}

interface A2{

    default void print(){
        System.out.println("  A2 inteface");
    }

}