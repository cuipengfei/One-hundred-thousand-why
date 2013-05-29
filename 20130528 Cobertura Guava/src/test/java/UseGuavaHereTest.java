import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UseGuavaHereTest {
    @Test
    public void testTryUseGuava() throws Exception {
        List<String> strings = new UseGuavaHere().tryUseGuava();
        assertThat(strings.get(0), is("1hello"));
        assertThat(strings.get(1), is("2hello"));
        assertThat(strings.get(2), is("3hello"));
    }

    @Test
    public void testTryUseGuava2() throws Exception {
        List<String> strings = new UseGuavaHere().tryUseGuava2();
        assertThat(strings.get(0), is("1hello"));
        assertThat(strings.get(1), is("2hello"));
        assertThat(strings.get(2), is("3hello"));
    }
}
