## 常见java使用
### 1. 获取当前日期，时间
```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    // 获取当前日期+时间
    LocalDateTime dateTime = LocalDateTime.now(); 
    // 输出格式话的日期
    // 其中 HH输出为24小时制，hh输出为12小时制
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss");
    // 转化为String
    String time = formatter.format(dateTime);

}
```

### 2. java VO, DTO, DO, PO, POJO

### 3. java 自定义异常及异常的使用


