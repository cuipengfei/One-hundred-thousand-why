import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsGuavaListInitBetter {
    public void differentWaysOfInitLists() {
        ArrayList<String> arrayList = null;

        arrayList = new ArrayList<String>();//直接new，手动写全

        arrayList = new ArrayList<>();//type inference

        arrayList = new ArrayList();//open generic type

        arrayList = Lists.newArrayList();//guava

        arrayList = myNewArrayList();//my own impl

        //这段代码反编译出来是这样的：

        //ArrayList arrayList = null;
        //arrayList = new ArrayList();
        //arrayList = new ArrayList();
        //arrayList = new ArrayList();
        //arrayList = Lists.newArrayList();
        //arrayList = myNewArrayList(new String[0]);

        //这几种方式没什么太大的差异，反正类型是要被擦除的，
        //至多节省一个<String>而已,
        //所以如果需要new的只是个简单的List的话，Guava体现不了优势。

        //Guava有优势的是init这种：
        Map<String, Map<List<Integer>, Map<Double, Boolean>>> map1 =
                new HashMap<String, Map<List<Integer>, Map<Double, Boolean>>>();
        Map<String, Map<List<Integer>, Map<Double, Boolean>>> map2 = Maps.newHashMap();
        //但是这种优势也只体现在Java 6中，因为7可以这样写
        Map<String, Map<List<Integer>, Map<Double, Boolean>>> map3 = new HashMap<>();
    }

    private <T> ArrayList<T> myNewArrayList(T... items) {
        ArrayList<T> arrayList = new ArrayList<T>();

        for (T item : items) {
            arrayList.add(item);
        }

        return arrayList;
    }
}
