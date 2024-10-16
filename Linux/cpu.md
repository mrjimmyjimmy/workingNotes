# cpu

## 频率
- 安装cpupower工具 `yum install kernel-tools`
- 查看cpu最大频率 `cat /sys/devices/system/cpu/cpu*/cpufreq/cpuinfo_max_freq`
- 设置cpu频率 `cpupower frequency-set --min 4000000 --max 4000000`
- 设置单个cpu频率 `cpupower -c 4 frequency-set --min 4000000 --max 4000000`
- 查看是否成功 `cpupower frequency-info`