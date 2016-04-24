### Spring-base
------
~~~
核心功能：
    1. 容器是一个大工厂，负责创建和管理所有的Java对象，叫做Bean
    2. Bean之间存在依赖关系，使用依赖注入方式实现，使得原先用过new方式或者工厂类方式主动获取对象，变为配置文件中写入，然后被动获取就可以
    因此是控制反转了(IOC)，依赖注入(DI)。
~~~
~~~
两种注入方式：P543
    1. 如果参数复杂，使用构造函数会略显臃肿，同时需要在构造时候实例化全部实例，影响性能
    2. 构造注入会确定依赖关系的注入顺序。
~~~
~~~
    BeanFactory是父接口，定义了获取bean的多种方法
        子类：DefaultListableBeanFactory

        子接口：ApplicationContext
            子类：FileSystemXmlApplicationContext;
                 ClassPathXmlApplicationContext;
                 AnnotationConfigApplicationContext;
    区别：BeanFactory不会预先初始化所有的bean
         ApplicationContext 会在首次加载时候就把所有bean，同时set进入，因此在开启时会占用很大内存
         可以使用lazy-init="true"实行懒加载
~~~
~~~
三种实例化Bean的方式
    1. 使用构造器创建Bean实例
    2. 使用静态工厂方法创建Bean
    3. 使用实例工厂方法
~~~