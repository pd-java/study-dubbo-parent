# study-dubbo-parent
# studyDubboOne
第一次练习分布式，技术栈为springboot+dubbo+zookeeper     
目前实现功能：

1、消费者调用生产者方法成功  

2、轮询方式测试成功（负载均衡）

      2.1 通过zookeeper动态设置服务提供者（生产者）权重（倍权、半权）
   
      2.2 消费者在@Reference(loadbalance="xxx")中设置调用方式（random：随机、roundrobin：轮询、leastactive：最少活跃数、ConsistentHash：一致性哈希）
   
      2.3 在生产者的@Service(weight="100")中写死权重

3、服务容错测试成功（使用hystrix）

      3.1 引入SpringCloud的hystrix（pom.xml中）
  
      3.2 启动类Application上添加注解@EnableHystrix
  
      3.3 生产者方法上添加@HystrixCommand
  
      3.4 消费者方法上添加@HystrixCommand(fallbackMethod="hello")
  
      3.5 消费者自定义一个hello方法，当调用生产者方法失败或异常时，就会调用本地hello方法
  
