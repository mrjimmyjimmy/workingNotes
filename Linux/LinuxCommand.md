## Linux指令

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

### 5. 压缩和解压缩 tar

#### gz
- 解压 `tar -xvzf FileName.tar.gz DirName/`
- 压缩 `tar -cvzf FileName.tar.gz DirName/`
```
c 字母表示创建一个新的归档。
v 字母表示详细列出正在处理的文件名（译者注：即显示进度）。
f 字母表示接下来跟着的是要处理的文件名。
z 字母表示使用gzip进行压缩和解压。
```

### 6. 定时任务 cron
- 存放位置 /var/spool/cron/
- 调度和维护 /etc/crontab
- 编辑 `crontab -e`
- 查看 `crontab -l`




