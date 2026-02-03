# 后端API接口对接前端开发文档

## 概述

本文档详细介绍了后端系统提供的API接口，供前端开发人员进行对接。后端采用Spring Boot + MyBatis架构，提供了完整的动物管理系统功能。

## API基础信息

- **服务器地址**: `http://localhost:8080` (默认)
- **协议**: HTTP
- **数据格式**: JSON
- **字符编码**: UTF-8

## 响应格式规范

后端统一使用JsonResult作为响应格式：

```json
{
  "state": 66,
  "message": "描述信息",
  "data": {}
}
```

- `state`: 响应状态码
  - `66`: 成功
  - `44`: 账号被占用
  - `45`: 账号错误
  - `46`: 密码错误
  - `100`: Session过期
- `message`: 错误描述信息
- `data`: 成功时返回的具体数据

## 接口详情

### 1. 管理员登录

#### 接口信息
- **URL**: `/adminLogin`
- **Method**: POST
- **Content-Type**: application/x-www-form-urlencoded

#### 请求参数
| 参数名 | 类型 | 必填 | 描述 |
|--------|------|------|------|
| username | String | 是 | 用户名 |
| password | String | 是 | 密码 |

#### 成功响应示例
```json
{
  "state": 66,
  "data": {
    "id": 1,
    "username": "admin",
    "password": "encrypted_password"
  }
}
```

#### 错误响应示例
```json
{
  "state": 45,
  "message": "账号错误"
}
```

### 2. 管理员登出

#### 接口信息
- **URL**: `/adminLogout`
- **Method**: POST
- **Content-Type**: application/x-www-form-urlencoded

#### 请求参数
无

#### 成功响应示例
```json
{
  "state": 66
}
```

### 3. 修改管理员密码

#### 接口信息
- **URL**: `/adminPassUpdate`
- **Method**: POST
- **Content-Type**: application/x-www-form-urlencoded

#### 请求参数
| 参数名 | 类型 | 必填 | 描述 |
|--------|------|------|------|
| oldPass | String | 是 | 旧密码 |
| newPass | String | 是 | 新密码 |

#### 成功响应示例
```json
{
  "state": 66
}
```

#### 错误响应示例
```json
{
  "state": 46,
  "message": "密码错误"
}
```

### 4. 动物管理接口

根据后端控制器命名规则，推测存在以下动物管理接口：

#### 动物信息查询
- **URL**: `/dongwuMana`
- **Method**: GET

#### 动物信息添加/更新
- **URL**: `/dongwuAddUpdate`
- **Method**: POST
- **Content-Type**: application/json

#### 动物信息删除
- **URL**: `/dongwuDelete`
- **Method**: POST
- **Content-Type**: application/x-www-form-urlencoded
- **参数**: id (动物ID)

### 5. 其他模块接口

后端还实现了多个管理模块，根据控制器命名推测如下：

- **公告管理**: [/gonggao*](file://d:\MyProject\项目源码\target\classes\static\view\gonggao\gonggaoAll.html)
- **回访管理**: [/huifang*](file://d:\MyProject\项目源码\target\classes\static\admin\huifang\huifangAdd.html)
- **介绍管理**: [/jieshao*](file://d:\MyProject\项目源码\target\classes\static\admin\jieshao\jieshaoMana.html)
- **接种管理**: [/jiezhong*](file://d:\MyProject\项目源码\target\classes\static\admin\jiezhong\jiezhongAdd.html)
- **类别管理**: [/leibie*](file://d:\MyProject\项目源码\target\classes\static\admin\leibie\leibieAdd.html)
- **领养管理**: [/lingyang*](file://d:\MyProject\项目源码\target\classes\static\admin\lingyang\lingyangAdd.html)
- **留言管理**: [/liuyanban*](file://d:\MyProject\项目源码\target\classes\static\view\liuyanban\liuyanbanAll.html)
- **人员管理**: [/renyuan*](file://d:\MyProject\项目源码\target\classes\static\arenyuan\index.html)
- **申请管理**: [/shenqing*](file://d:\MyProject\项目源码\target\classes\static\view\shenqing\shenqingAdd.html)
- **新闻管理**: [/xinwen*](file://d:\MyProject\项目源码\target\classes\static\view\xinwen\xinwenAll.html)

### 6. 文件上传接口

- **URL**: `/upload`
- **Method**: POST
- **Content-Type**: multipart/form-data

## 异常处理

当遇到异常情况时，后端会抛出特定异常，前端应根据返回的state值处理：

- `44`: 提示"账号被占用"
- `45`: 提示"账号错误"
- `46`: 提示"密码错误"
- `100`: 提示"session过期，请重新登录"

## 开发注意事项

1. 所有请求都需要保持Session状态，确保登录状态有效
2. 敏感操作前应验证用户权限
3. 对于文件上传，需要使用multipart/form-data格式
4. 所有接口调用都应该有适当的错误处理机制
5. 建议在开发阶段使用拦截器记录请求日志，便于调试

## 示例代码

Flutter中调用后端API的示例：

```dart
import 'package:http/http.dart' as http;
import 'dart:convert';

Future<Map<String, dynamic>> adminLogin(String username, String password) async {
  final response = await http.post(
    Uri.parse('http://localhost:8080/adminLogin'),
    headers: <String, String>{
      'Content-Type': 'application/x-www-form-urlencoded',
    },
    body: <String, String>{
      'username': username,
      'password': password,
    },
  );

  if (response.statusCode == 200) {
    return json.decode(response.body);
  } else {
    throw Exception('登录请求失败: ${response.statusCode}');
  }
}
```

## 调试建议

1. 启动后端服务后，可以使用浏览器开发者工具监控网络请求
2. 可以使用Postman等API测试工具验证接口
3. 前端开发时建议先在模拟器上测试，再部署到真机
4. 注意跨域问题，后端已配置CORS支持

如需了解其他特定接口的详细信息，可进一步查阅后端源代码或进行接口测试。