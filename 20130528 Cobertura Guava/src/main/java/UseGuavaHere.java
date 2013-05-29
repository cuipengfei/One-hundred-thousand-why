import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class UseGuavaHere extends ParentClass {
    public List<String> tryUseGuava() {
        ArrayList<String> integers = Lists.newArrayList("1", "2", "3");
        return Lists.transform(integers, new Function<String, String>() {
            @Override
            public String apply(String str) {
                return str + "hello";
            }
        });
    }

    public List<String> tryUseGuava2() {
        ArrayList<String> integers = Lists.newArrayList("1", "2", "3");
        return Lists.transform(integers, new Function<String, String>() {
            @Override
            public String apply(String str) {
                return makeString(str);
            }
        });
    }
}
