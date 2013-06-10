import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HamcrestContainsTest {
    @Test
    public void whyDoesContainsMethodReportMethodNotFoundError() {
        assertThat("abc", is("abc"));
    }
}
