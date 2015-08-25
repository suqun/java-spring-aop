# java-spring-aop 

##AOP基础知识

* Joinpoint 程序执行的某个特定位置：如类初始化前，类初始化后，类方法的调用前，调用后，方法抛出异常后　等。Spring仅支持方法的joinpoint

* Pointcut AOP通过pointcut定位特定的joinpoint。

* Advice 织入到目标类joinpoint上的一段程序代码

* Introduction 特殊的advice，它为类添加一些属性和方法。

* Weaving 将advice添加到目标类具体joinpoint上的过程。AOP的三种织入方式：编译期织入，类装载期织入，动态代理织入。
