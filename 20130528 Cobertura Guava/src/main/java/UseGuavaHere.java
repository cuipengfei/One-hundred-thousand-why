import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class UseGuavaHere {
    public List<String> tryUseGuava2() {
        ArrayList<String> integers = Lists.newArrayList("1", "2", "3");
        return Lists.transform(integers, new Function<String, String>() {
            @Override
            public String apply(String str) {
                //里面这段代码不会执行的，因为测试没有去读取List里面的元素，只是判断List不是null
                //因为Guava的transform是延迟执行的，所以不会运行。
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("h");
                sb.append("e");
                sb.append("ll");
                sb.append("o");
                return sb.toString();
            }
        });
    }
}
