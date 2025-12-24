# nohup
nohup: run a command immune to hangups. 退出后指令仍可在后台运行
- nohup command [arg]
- 举例
  1. nohup java -jar demo.jar &
  nohup和&结合在一起，可以不挂断的永久在后台运行

  2. nohup java -jar demo.jar 2>&1 &
  "2>&1"表示错误和输出都传到nohup.out文件中（默认只把输出传到nohup.out文件中）

  3. nohup java -jar demo.jar > /dev/null 2>&1 &
  "> /dev/null" 表示将输出改为传到/dev/null中，/dev/null 表示输出到空设备（丢弃输出）