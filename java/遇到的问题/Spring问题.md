
### 1. hibernate建表时发现entity没有注册
   - 经排查发现是因为有两个entity所对应的@Table注解的表名一样
   - e.g. @Table(name = "t_test) 和 @Table(name = "t_test")会被认为是一个entity
   
### 2. 