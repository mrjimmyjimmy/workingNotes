# MySQL

### MySQL 数据导入导出
- 导出 
    - mysqldump -u[用户名] -h[host] -p[密码] -P[端口] 数据库名 数据库表
    - --ignore-table = [数据库名].[表名]
mysqldump -u starharbour -h 10.214.0.16 -P 3306 -p --ignore-table=StarHarbour.clustermgr_active_hosts --ignore-table=StarHarbour.clustermgr_native_hosts --ignore-table=StarHarbour.clustermgr_ssh_hosts --single-transaction --no-tablespaces --database StarHarbour > shb.sql
EwFKm6aLn!GevWN1
- 导入
    - mysql -h[ip] -P[端口] -u[用户名] -p[密码]  [数据库名] < d:XX.sql(路径) 
mysql -h 10.1.6.202 -P 3306 -u root -phiggs123 --database StarHarbour < shb.sql

### Centos安装mysql


### MySQL更改密码
#### 8.0 版本
- 登录 mysql
- mysql> `ALTER USER 'root'@'localhost' IDENTIFIED BY '新密码';`
- 更改密码强度 mysql> `SET GLOBAL validate_password.policy=LOW;` 
    