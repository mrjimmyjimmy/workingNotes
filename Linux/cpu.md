# cpu

## 频率
- 安装cpupower工具 `yum install kernel-tools`
- 查看cpu最大频率 `cat /sys/devices/system/cpu/cpu*/cpufreq/cpuinfo_max_freq`
- 设置cpu频率 `cpupower frequency-set --min 4000000 --max 4000000`
- 设置单个cpu频率 `cpupower -c 4 frequency-set --min 4000000 --max 4000000`
- 查看是否成功 `cpupower frequency-info`

## taskset
用于设置进程或线程的CPU亲和性，可以将进程绑定到1个或多个CPU上去执行，而不允许调度到别的cpu上

可以使用十六进制或者--cpu-list来表示