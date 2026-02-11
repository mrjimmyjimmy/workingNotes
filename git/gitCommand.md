# git
### git remote

例子
```
$ git remote add origin git@github.com:mrjimmyjimmy/introduction-to-java-programming.git
```

### github设置ssh key
```
1. 首先设置git的username 和 email
$ git config -- global user.name "xuzhe"
$ git config -- global user.email "xuzhe@localhost.localdomain"

2. 生成ssh key
$ ssh-keygen -t rsa -C "user@email.com"
$ cat ~./ssh/id_rsa.pub

3. github 添加ssh key
```

### git 回滚
```
1. 设置head
git reset --hard b35e734
```

### gitignore不生效
清除本地缓存在提交
git rm -r --cached .
git add .
git commit -m "update .gitignore"
git push -u origin main/master