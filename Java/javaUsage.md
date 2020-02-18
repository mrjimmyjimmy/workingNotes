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
#### VO(View Object) 视图对象：
    用于展示层，把某个页面或组件的左右数据封装起来

#### DTO(Data Transfer Object) 数据传输对象：
    用于在view和server端之间传输数据。DTO可以用来保护数据库表结构不被泄露。
    如：一个User的DO会在server端去掉某些字段（password）然后封装成DTO传到前端。
    或者多个DO（User，Address）集合成一个DTO。

#### DO(Domain Object) 领域对象：
    是从现实世界中抽象出来的业务实体。

#### PO(Persistent Object) 持久对象：
    对应数据库中的entity，一个PO对应数据库中的一条记录。
    
---

### 3. java 自定义异常及异常的使用

### 4. 长路求值（&，|）和短路求值（&&，||）
java中长路运算&是指两边的条件都进行判断才得出true/false但是短路运算&&只要算出左边的值为false就会返回
```java
int i = 2;
int j = 3;
int k = 4;
// 会判断i和j，j和k才给出false
if (i > j & i > k) {
    // do something
}

// 判断玩i和j后，跳过i和k，直接给出false
if (i > j && i > k) {
    // do something
}
```

### 5. java读文件
java读文件的方法
#### bufferReader.readLine
```java
public class FileReader {
    String filePath = "D:\\git\\project\\demo.txt";
    FileReader fileReader = new FileReader(filePath);
    BufferReader bufferReader = new BufferReader(fileReader);
    // 调用readLine, 逐行读取获得String
    while ((fileLine = bufferReader.readLine()) != null) {
        String[] data = fileLine.split("regExp", -1); // 这里regExp表示按什么方式分割字符串，-1表示得到的数组长度
    }   
}
```



