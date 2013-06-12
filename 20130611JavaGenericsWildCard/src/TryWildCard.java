import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

public class TryWildCard {
    public void normalList() {
        List<A> listOfA = new ArrayList<A>();
        listOfA.add(new A());
        listOfA.add(new B());

        //普通泛型列表，声明为A的列表，可以向其中加入A和B

        //listOfA = new ArrayList<B>();
        //上面一行非法
    }

    public void wildCardList() {
        List<? extends A> listOfAOrItsChildren = new ArrayList<A>();
        listOfAOrItsChildren = new ArrayList<B>();

        //声明时用了wild card的List可以初始化为A活着B的List

        //listOfAOrItsChildren.add(new A());
        //listOfAOrItsChildren.add(new B());

        //上面两行都非法。
        //声明时我们的代码表达了这么一个意思：这个List有可能是List of任何A的子类。
        //我们可以把它初始化为List of B，也可以是List of C（如果有个C也继承自A的话）。
        //因为无法确定List到底被初始化为什么，自然就不可以添加东西进去。
        //如果初始化为List of A，添加进去B还好；如果初始化为List of B，而添加进去C，就会造成错误了。

        //这样看来wild card似乎很鸡肋，其实不然，下面这种场景它很有用:

        processTheWholeList(new ArrayList<A>());
        processTheWholeList(new ArrayList<B>());
    }

    private void processTheWholeList(List<? extends A> list) {
        for (A a : list) {
            //process this item
        }
    }
}
