# bzip2

bzip2 用于压缩文件。采用更高效的Burrows-Wheeler压缩算法，提供更好的压缩率，但通常压缩速度稍慢。

bzip2 [options] [file...]

**options常用参数：**
- -d --decompress 解压缩一个.bz2文件。相当于使用bunzip2
- -k -keep 保留原始文件，不删除
- -v --verbose 显示详细过程
- -z 强制压缩，即使文件已经被压缩
- -t 测试压缩文件的完整性
- -1 到 -9 压缩比例，-1是最快压缩，压缩率最低；-9是最慢压缩，压缩率最高。默认是-9

解压到指定目录
- bzip2 -dcv file.txt.bz2 > ../rename.txt