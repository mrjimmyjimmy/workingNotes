# 数据库，网络，操作系统
- pyy提问

# Java 基础
#### 下面的代码不能通过编译，为什么
```java
public class A {
  public static double sum(List<Double> list)
  {
    double ret = 0;
    for(Double v : list)
      ret += v;
    return ret;
  }
  public static int sum(List<Integer> list)
  {
    int ret = 0;
    for(Integer v : list)
      ret += v;
    return ret;
  }
}
```
- 答案：
```javascript
泛型参数类型在编译后都会被清除掉，方法签名重复。
```

# Spring, Redis, 项目问题
#### 假定MySQL里有2亿数据，redis中只存20w的数据，如何保证redis中的数据都是热点数据？
- 答案：
```
简单实现缓存失效的思路: LRU(最近少用的淘汰)即redis的缓存每命中一次,就给命中的缓存增加一定ttl(600s)。
一段时间后, 热数据的ttl都会较大, 不会自动失效, 而冷数据基本上过了设定的ttl就马上失效了。

或者用redis自身数据淘汰策略，计算一下20W数据的内存限制即可
```

#### 依赖注入（Dependency Injection，DI）方式？
- 答案：
```
field 注入（属性注入）
setter 注入
constructor 注入（构造器注入）
```

#### Spring如何解决循环依赖的？
- 答案：
```

```

# 算法题
#### 有一面2 * n的墙，铺满1 * 2的砖，有多少种铺法
- 答案：
```java
    // 斐波那契数列
    public int buildWall(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else return buildWall(n - 1) + buildWall(n - 2);
    }
```

### N × N 的矩阵旋转 90 度
- 答案：
```java
    int[][] matrix = {{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
```






