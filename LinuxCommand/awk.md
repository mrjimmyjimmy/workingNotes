# awk
awk主要用于逐行处理，其会自动分割文本为数组

### 基本用法
awk '条件 {动作 变量}' 文件

demo.txt:
1 aa bb cc
2 dd ee ff

- awk '{print $0}' demo.txt
```
1 aa bb cc
2 dd ee ff
```
print 表示打印；$0表示所有内容

- awk '{print $2}' demo.txt
```
aa
bb
``` 
$2 表示数组的第二个元素