import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class HamcrestContainsTest {
    @Test
    public void whyDoesContainsMethodReportMethodNotFoundError() {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("123");
        strings.add("abc");
        strings.add("hello");

        assertThat(strings, contains("123", "abc", "hello1"));

        //hamcrest的matchers，contains这个方法失败时为什么报的是method not found，而不是expected和actual不符呢？

        //因为junit自己定义了一个山寨的org.hamcrest.Matcher接口，而这个接口比正版hamcrest的接口少一个describeMismatch方法。
        //如果你在maven或者gradle里先引用了junit，而后引用了hamcrest，就会导致运行时缺斤短两的接口被使用，那就会出现这个问题。

        //解决方式：掉转依赖声明的顺序；或者是改用junit 4.11，这个版本的junit去掉了Matcher。
    }
}
