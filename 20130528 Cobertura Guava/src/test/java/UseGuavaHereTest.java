import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class UseGuavaHereTest {
    @Test
    public void testTryUseGuava2() throws Exception {
        List<String> strings = new UseGuavaHere().tryUseGuava2();
        assertThat(strings, notNullValue());
    }
}
