package tryinnerclass;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class TheMysteryIsLikeThis {
    public void tryUsingGuava() {
        final int expectedLength = 4;
        Iterables.filter(Lists.newArrayList("123", "1234"), new Predicate<String>() {
            @Override
            public boolean apply(String str) {
                return str.length() == expectedLength;
            }
        });
    }
}
