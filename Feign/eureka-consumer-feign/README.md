# 工程简介
由于Feign是基于Ribbon实现的，所以它自带了客户端负载均衡功能，也可以通过Ribbon的IRule进行策略扩展。另外，Feign还整合的Hystrix来实现服务的容错保护，在Dalston版本中，Feign的Hystrix默认是关闭的

# 延伸阅读
*   https://blog.didispace.com/spring-cloud-starter-dalston-2-3/
