# yum

### 为yum源配置代理
#### 全局设置
假设我们想要为 /etc/yum.repos.d/ 下的所有仓库设置代理，则可以修改 /etc/yum.conf 文件，在该文件尾部添加如下一行：
`proxy=http://ip:port`


#### 卸载
`yum remove`

### yum 冲突
- 找出冲突应用 `ps aux | grep yum`
- 终止 `kill -9 [pid]`