## Linux指令

### 1. SCP
scp用来实现主机之间的交换文件。使用ssh协议，如果要进行免密复制，需要发送密钥给相应的结点。

    scp [user]@[host]:file1 [user]@[host]:file2
    常用指令：
    1. -r 复制目录时使用
    2. . 复制到当前目录
```$xslt
举例
scp发送主机文件到远程节点
scp /git/demo/test.txt root@192.168.0.1:~/git/demo

scp下载远程节点文件到本机
scp root@192.168.0.1:~/git/demo/test.txt .
```

### 2. htop和nohup
nohup: run a command immune to hangups. 退出后指令仍可在后台运行
htop

    nohup command [arg]
    
```$xslt
举例
1. nohup java -jar demo.jar &
nohup和&结合在一起，可以不挂断的永久在后台运行

2. nohup java -jar demo.jar 2>&1 &
"2>&1"表示错误和输出都传到nohup.out文件中（默认只把输出传到nohup.out文件中）

3. nohup java -jar demo.jar > /dev/null 2>&1 &
"> /dev/null" 表示将输出改为传到/dev/null中，/dev/null 表示输出到空设备（丢弃输出）

```

### 3. journalctl
journalctl 来查看由systemd写入的日志


### 4. 创建软连接

### ls ll
ll command not found 需要加入alias ll == ls -al

alias ll="ls -al"



