# SCP
scp用来实现主机之间的交换文件。使用ssh协议，如果要进行免密复制，需要发送密钥给相应的结点。

`scp [user]@[host]:file1 [user]@[host]:file2`

常用指令：
1. -r 复制目录时使用
2. . 复制到当前目录

- scp发送主机文件到远程节点
`scp /git/demo/test.txt root@192.168.0.1:~/git/demo`

- scp下载远程节点文件到本机
`scp root@192.168.0.1:~/git/demo/test.txt .`