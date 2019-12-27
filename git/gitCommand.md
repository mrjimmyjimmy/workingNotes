## git 指令
### 1. git remote

例子
```
$ git remote add origin git@github.com:mrjimmyjimmy/introduction-to-java-programming.git
```

### 2. github设置ssh key
```
1. 首先设置git的username 和 email
$ git config -- global user.name "xuzhe"
$ git config -- global user.email "xuzhe@localhost.localdomain"

2. 生成ssh key
$ ssh-keygen -t rsa -C "user@email.com"
$ cat ~./ssh/id_rsa.pub

3. github 添加ssh key
```