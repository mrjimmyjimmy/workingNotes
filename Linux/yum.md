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

## rpm
linux下所有的包都通过rpm来安装和卸载，全称为Redhat package manager

### 安装
- rpm -ivh package.rpm
  - i: 安装包
  - v: 显示详细信息
  - h: 显示进度条

- 或者使用dnf安装，会自动处理依赖关系，如果有依赖的包会一并安装
  - dnf install package.rpm

#### 无网络离线安装 通过repotrack下载rpm包
- 安装yumutils. yum -y install yum-utils
- 下载离线包. repotrack htop
- rpm安装离线包. rpm -Uvh --force --nodeps *.rpm