
### 1. hibernate建表时发现entity没有注册
    - 经排查发现是因为有两个entity所对应的@Table注解的表名一样
    - e.g. @Table(name = "t_test) 和 @Table(name = "t_test")会被认为是一个entity
   
### 2. hibernate entity 字段插入值不能为null
entity类型不使用基本数据类型
```java
private int age; // age的值不能为空
private Integer age; // age 可为null
```