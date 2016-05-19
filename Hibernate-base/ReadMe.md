### Hibernate
------
This module is learn real Hibernate.
~~~
  面向对象的程序设计(对象)     (关系）关系型数据库
                         ORM
                         映射
作用：将面向对象方式的操作转化为对应的SQL操作（对象<->表）,释放开发者95%的的持久化操作时间
~~~

~~~
O,  Object   对象  (PO 持久化对象，使用普通的java类即可POJO（Plain Ordinary Java Object）)
R， Realtion 关系  (关系型数据库: MySQL, Oracle…)
M， Mapping  映射
~~~

~~~
PO类即为普通的POJO类，不需要任何继承等，因此是非侵入式设计
1. 瞬态 PO未与Session有关联过
2. 持久化 PO实例雨Session关联起来，且对应到数据库记录中
3. 托管 PO实例曾经与Session关联过，由于其他原因，脱离了。
~~~

~~~
/**
 * JPA标准注解
 * Entity：表面该类是一个Hibernate的持久化类
 * Table：指定该类映射的表，映射到new_inf表上
 * Id：映射为主键
 * GeneratedValue：主键的生成策略，此处为自增长
 */
~~~

~~~
NewsTest 实例表示Hibernate的使用过程为
1. 开发持久化类
2. 获取Configuration
3. 获取SessionFactory
4. 获取Session，打开事务
5. 用面向对象的方式操作数据库
6. 关闭事务，关闭Session
~~~