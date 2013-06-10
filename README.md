DailyStackOverflowQuestion
==========================

DailyStackOverflowQuestion

2013 05 28

Cobertura有时候统计不到使用Guava的代码的coverage。为什么？

是因为guava的lazy evaluation的原因（详情见代码内注释）。

2013 05 29

在Spring中Inject Integer和String。不用SO了。

2013 05 30 (这个日期好像记错了)

guava的初始化集合的方式真的更好吗？

不是的，这个比用普通的开放泛型类型或者是Java 7的diamonds没多少优势。（详情见代码内注释）

2013 06 04

setWifiApEnabled是怎么隐藏掉的。

2013 06 05

hamcrest的matchers，contains这个方法失败时为什么报的是method not found，而不是expected和actual不符呢？

这是dependency conflict造成的。主要原因是JUnit自己画蛇添足的声明了一个org.hamcrest.Matcher的接口（详情见代码内注释）。