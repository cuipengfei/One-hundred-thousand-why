import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/29/13
 * Time: 12:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class UseGuavaHere {
    public List<String> tryUseGuava() {
        ArrayList<String> integers = Lists.newArrayList("1", "2", "3");
        return Lists.transform(integers, new Function<String, String>() {
            @Override
            public String apply(String str) {
                return str + "hello";
            }
        });
    }
}
