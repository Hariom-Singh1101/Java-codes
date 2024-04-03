
interface i1 {
    int x = 40;

    void fun1();

    static void fun2() {
        System.out.println("x is " + x);
    }
}

interface i2 extends i1 {
    int y = 80;
    int x=30; // we can overide the values of the variable

    void fun3();

    static void fun4() {
        System.out.println("y is " + y);
    }
}

class First implements i2 {
    public void fun1() {

    }
    static void fun2() {
        System.out.println("x is " + x);
    }

    public void fun3() {
    }
    static void fun4() {
        System.out.println("y is " + y);
    }

}

class Interface1 {
    public static void main(String args[]) {
        // First C1 = new First();

        // i2.fun2(); // we cannot inherrite static function
        // C1.fun2();
        i2.fun4();
    }
}
