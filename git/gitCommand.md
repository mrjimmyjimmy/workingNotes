# git
### git remote

例子
```
$ git remote add origin git@github.com:mrjimmyjimmy/introduction-to-java-programming.git
```

#### 本机添加201的仓库
- 从201复制仓库到本地
- git remote remove origin 删去远端
- git remote add origin 201:/home/xuzhe/git/Falcon-fld 添加201为远端
- git push -u origin main && git pull 同步
- 201仓库 git config receive.denyCurrentBranch updateInstead


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