十万个为什么
==========================

###2013 05 28

Cobertura有时候统计不到使用Guava的代码的coverage。为什么？

是因为guava的lazy evaluation的原因[（详情见代码内注释）](https://github.com/cuipengfei/DailyStackOverflowQuestion/blob/master/20130528%20Cobertura%20Guava/src/main/java/UseGuavaHere.java)。

###2013 05 29

在Spring中Inject Integer和String。不用SO了。

###2013 05 30 (这个日期好像记错了)

guava的初始化集合的方式真的更好吗？

不是的，这个比用普通的开放泛型类型或者是Java 7的diamonds没多少优势。[（详情见代码内注释）](https://github.com/cuipengfei/DailyStackOverflowQuestion/blob/master/20130530%20GuavaListInit/src/main/java/IsGuavaListInitBetter.java)。

###2013 06 04

setWifiApEnabled是怎么隐藏掉的？

编译时用的只是个stub包，运行时用的才是真的完整版的。[（详情见代码内注释）](https://github.com/cuipengfei/DailyStackOverflowQuestion/blob/master/20130604%20AndroidHiddenAPI/MyApplicationProject/MyApplication/src/main/java/TryToHideSomeAPI.java)。

###2013 06 05

hamcrest的matchers，contains这个方法失败时为什么报的是method not found，而不是expected和actual不符呢？

这是dependency conflict造成的。主要原因是JUnit自己画蛇添足的声明了一个org.hamcrest.Matcher的接口[（详情见代码内注释）](https://github.com/cuipengfei/DailyStackOverflowQuestion/blob/master/20130605%20HamcrestContainsMismatch/src/test/java/HamcrestContainsTest.java)。

###2013 06 07

中国现行的宪法曾经过怎样的修改？

[（1988年对1982年的修改）](https://github.com/cuipengfei/One-hundred-thousand-why/commit/553f44001cbe63bf72c5781d76c30c896c26dc60#20130528%20Cobertura%20Guava/src/main/resources/Constitution.txt)

[（1993年对1988年的修改）](https://github.com/cuipengfei/One-hundred-thousand-why/commit/11f5b300fb70d603bda05569c014eba44f249c95#20130528%20Cobertura%20Guava/src/main/resources/Constitution.txt)

[（1999年对1993年的修改）](https://github.com/cuipengfei/One-hundred-thousand-why/commit/6f4de4fba9bd3cf1368d616a8813a55cbe5e8d90#20130528%20Cobertura%20Guava/src/main/resources/Constitution.txt)

[（2004年对1999年的修改）](https://github.com/cuipengfei/One-hundred-thousand-why/commit/d681cc65bea99ec702c7cbcf150b783ac743cfc2#20130528%20Cobertura%20Guava/src/main/resources/Constitution.txt)

###2013 06 11

A<? extends X> 与 A < x > ,wild card的应用场景是啥？

[（详情见代码内注释）](https://github.com/cuipengfei/One-hundred-thousand-why/blob/master/20130611JavaGenericsWildCard/src/TryWildCard.java)。

###2013 06 21

为什么Java中的匿名内部类只可以访问final的局部变量呢？其他语言中的匿名函数也有类似的限制吗？

[解释见博客](http://cuipengfei.me/blog/2013/06/22/why-does-it-have-to-be-final/)

[代码在这里](https://github.com/cuipengfei/One-hundred-thousand-why/tree/master/20130621WhyDoesItHaveToBeFinal)

###2013 06 26

为什么JSP向tag中传递的list打印出来时加有[]？

[解释在这里](https://github.com/cuipengfei/One-hundred-thousand-why/tree/master/20130626ListInJSPTag/SpringMVC/compiledjspandtag/explaination.txt)

[重现的代码在这里](https://github.com/cuipengfei/One-hundred-thousand-why/tree/master/20130626ListInJSPTag/SpringMVC)
