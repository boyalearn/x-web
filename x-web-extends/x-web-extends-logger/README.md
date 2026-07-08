source-code
https://github.com/apache/skywalking/issues/9

MDC定义
Mapped Diagnostic Context，即：映射诊断环境。 MDC是 log4j 和 logback 提供的一种方便在多线程条件下记录日志的功能。 MDC 可以看成是一个与当前线程绑定的哈希表，可以往其中添加键值对。

MDC的使用方法
向MDC中设置值：MDC.put(key, value); 从MDC中取值：MDC.get(key); 将MDC中内容打印到日志中：%X{key}