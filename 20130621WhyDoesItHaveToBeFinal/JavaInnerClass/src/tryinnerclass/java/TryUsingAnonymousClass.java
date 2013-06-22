package tryinnerclass.java;

import tryinnerclass.MyInterface;

public class TryUsingAnonymousClass {
    public void useMyInterface() {
        final int number = 123;
        System.out.println(number);

        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                //number = 456; 这句编译不过
                System.out.println(number);
            }
        };
        myInterface.doSomething();

        System.out.println(number);
    }
}
