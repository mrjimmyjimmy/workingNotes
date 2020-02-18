
### 1. hibernate建表时发现entity没有注册
    - 经排查发现是因为有两个entity所对应的@Table注解的表名一样
    - e.g. @Table(name = "t_test) 和 @Table(name = "t_test")会被认为是一个entity
---
   
### 2. hibernate entity 字段插入值不能为null
entity类型不使用基本数据类型
```java
private int age; // age的值不能为空
private Integer age; // age 可为null
```
---

### 3. @Autowired警告：Field injection is not recommended
首先查询得知@Autowired的三种方式：构造器注入，set方法注入，变量（filed）注入。以一个简单的Controller为例：

```java
@Controller
public class ControllerA {

    // 通过构造器注入
    private final ServiceA serviceA;
    private final ServiceB serviceB;
    @Autowired
    public ControllerA(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }
    
    // set方法注入
    private ServiceA serviceA;
    private ServiceB serviceB;
    @Autowired
    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
    
    @Autowired
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
    
    // filed注入
    @Autowired
    private ServiceA serviceA;
    @Autowired
    private ServiceB serviceB;
}
```
1. 如果使用构造器注入，当依赖过多时，构造函数的参数会很长
2. 如果使用setter方法注入，不能将属性值设为final
3. 如果使用filed反射注入
- 如果不用spring框架，这个属性只能通过反射注入
- 如果不用spring创建对象时，可能引起NullPointerException
- 不能用final修饰

综上，建议使用构造器方法注入

---
### 4. spring boot 文件上传


### 5. api接口文档设计


### 6. 常量的使用
根据阿里巴巴java开发手册，常量的复用分为5层（放在相应的constant目录下）