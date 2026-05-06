## Linux 安装 Java
### Centos7
#### java17/21
- 下载java.tar解压到/usr/local/jdk/jdk21
- 配Java home
vim ~/.bash_profile
// 在文件末尾写入以下两行
export JAVA_HOME=/usr/local/jdk/jdk21
export PATH=$JAVA_HOME/bin:$PATH
// 重新加载配置文件
source ~/.bash_profile
- 注册java
alternatives --install /usr/bin/java java /usr/local/jdk/jdk21/bin/java 3
alternatives --install /usr/bin/javac javac /usr/local/jdk/jdk21/bin/javac 3
- 改java版本
alternatives --config java -> 3