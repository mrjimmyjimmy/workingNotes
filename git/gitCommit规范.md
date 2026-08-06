# git commit
## commit 规范
commit message 格式
`<type>(<scope>): <subject>`
### type 必须
用于说明git commit 类别，只允许使用下面标识：
- *feat* feature 新功能添加
- *fix* 修复bug
- *to* 临时提交/中间态
- *docs* documentation 文档
- *style* 格式（空格、分号、排版等），不影响代码运行的变动
- *refactor* 重构，不更新新功能，不修改bug
- *perf* 优化，比如提升性能、体验
- *chore* 构建、脚本、依赖等杂项
- *test* 测试
- *revert* 回滚某次提交
