#学习Redis

- 2021.07.06
学习redis的原因是因为在对监控项目进行性能优化的时候发现，因为存储了报单和行情的信息，会频发触发GC，
而且每次都将sevivour区的对象复制到老年区，gc占用过多的cpu。因此想引入redis，将报单和行情的信息存入redis

- redis 官网教程 
https://try.redis.io/?_ga=2.124715401.2002416866.1625556437-1815657568.1613790366

## redis 关键字


## redis 数据结构
### String
- SET 设置key-value            e.g. set name xu
- GET 根据key获取value                  e.g. get name -> xu
- EXIST 查看key是否存在              e.g. exist name
- INCR 自增，原子操作
- EXPIRE 设置key过期时间       e.g. expire name 120, 可以简写为EX set name 'xu' EX 5
- TTL 查看过期时间 -1永不过期 -2已经过期 e.g. ttl name
- PERSIST 取消过期时间       e.g. persist name
### List
list是有序的
- RPUSH 添加到最后，可变参数variadic       e.gg. rpush friends 1 2 3
- LPUSH 添加到开头，同上
- LRANGGE 显示subList，-1表示显示所有        e.g. lrange friends 0 1
- LPOP 取最前的并显示
- RPOP 取最后的并显示
- LLEN 查看长度
 
### Set
set是无序但是元素唯一
- SADD 添加，可变参数variadic， 1-不存在，0-已存在
- SREM 移除，1-已存在，0-不存在
- SISMEMBER 检测元素是否存在
- SMSMBERS 列出所有元素
- SUNION 列出多个set的元素
- SPOP 随记提取n个元素
- SRANDMEMBER 随记展示n个元素，若n为负，则重复展示

### Z-Set 有序set
同set

### Hashes
map，key和value都是string；语法类似String
- HSET 添加，可变参数       e.g. hset user name xu; hset user age 25；hset user name 'xu' age 25;
- HGETALL 获取所有
- HINCRBY 增加n       e.g. hincrby user age 5;
- hdel 删除

## redis with Java
使用spring boot 自带的template来进行对数据的操作

## Run redis
### redis 外网访问
- 确保防火墙开放6379端口
    - 开放端口 firewall-cmd --zone=public --add-port=6379/tcp --permanent
    - 查看开放端口 firewall-cmd --list-ports
    - 设置成permanent要重启防火墙 firewall-cmd --reload
- 修改配置文件，bind需要访问的端口
    - redis-cli 查看所有配置 CONFIG GET *
    - redis.conf 在/etc里 修改 bind 0.0.0.0
    - 重启redis service redis-server restart
- 利用requirepass
- 关闭redis持久化
    - 进入/etc/redis.conf
    - 注释掉 save 900 1; save 300 10; save 60 10000;

### redis-cli
#### 对key进行操作
- flushall 删除所有数据库中的所有key
- keys * 查询所有key

