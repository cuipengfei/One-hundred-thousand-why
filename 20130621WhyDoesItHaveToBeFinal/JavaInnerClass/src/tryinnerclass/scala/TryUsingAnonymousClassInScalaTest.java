package tryinnerclass.scala;

import org.junit.Test;

public class TryUsingAnonymousClassInScalaTest {
    @Test
    public void testUseMyInterface() throws Exception {
        new TryUsingAnonymousClassInScala().useMyInterface();
        System.out.println("===================");
        new TryUsingAnonymousClassInScala().useMyInterfaceWithLambda();
    }
}
