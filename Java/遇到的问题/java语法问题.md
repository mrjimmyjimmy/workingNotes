
### 1. private Long i = 0; 报错
在此例中，0为int类型，不能直接赋值给Long
```java
private long i = 0;
```
是可以的，因为0首先从int转为long，然后在赋值给i
```java
private Long i = 0L;
private Long i = new Long(0);
```
以上两种方法可以给Long初始化赋值