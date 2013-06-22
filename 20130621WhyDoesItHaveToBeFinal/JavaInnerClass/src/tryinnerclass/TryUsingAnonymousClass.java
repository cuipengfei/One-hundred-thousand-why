package tryinnerclass;

public class TryUsingAnonymousClass {
    public void useMyInterface() {
        final int number = 123;

        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                //number = 456; 这句编译不过
                System.out.print(number);
            }
        };
        myInterface.doSomething();

        System.out.print(number);
    }
}
