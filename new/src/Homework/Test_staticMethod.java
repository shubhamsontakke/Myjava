package Homework;

public class Test_staticMethod {
	public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println(a);
    }
	public static void main(String[] args) {
		Test_staticMethod.foo();
        Test_staticMethod.foo(10);
	
		// TODO Auto-generated method stub

	}

}
