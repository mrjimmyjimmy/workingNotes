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

### 无网络离线安装
#### 通过repotrack下载rpm包
- 安装yumutils. yum -y install yum-utils
- 下载离线包. repotrack htop
- rpm安装离线包. rpm -Uvh --force --nodeps *.rpm