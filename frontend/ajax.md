## ajax 技术

### 1. ajax 提交form表单
```javascript
$("#formId").submit(function (e) {
    e.preventDefault(); // 防止表单提交
    const form = $(this);
    
    $.ajax({
    type: "POST",
    url: "/api/post",
    data: form.serilaize(), // 序列化form
    success: function (res) {
        location.reload(); // 重载界面
        }
    })
})
```