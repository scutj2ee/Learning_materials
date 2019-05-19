# 乐优商城门户

门户系统面向的是用户，安全性很重要，而且搜索引擎对于单页应用并不友好。因此门户系统不再采用与后台系统类似的SPA（单页应用）。依然是前后端分离，不过前端的页面会使用独立的html，在每个页面中使用vue来做页面渲染。采用live-server热部署方式

## 部署与安装

### 安装：

```npm install -g live-server```

### 运行：

```live-server```

#### 例如：

```live-server --port=9002```

#### 运行参数：

+ --port=NUMBER - 选择要使用的端口，默认值：PORT env var或8080

+ --host=ADDRESS - 选择要绑定的主机地址，默认值：IP env var或0.0.0.0（“任意地址”）

+ --no-browser - 禁止自动Web浏览器启动

+ --browser=BROWSER - 指定使用浏览器而不是系统默认值

+ --quiet | -q - 禁止记录

+ --verbose | -V - 更多日志记录（记录所有请求，显示所有侦听的IPv4接口等）

+ --open=PATH - 启动浏览器到PATH而不是服务器root

+ --watch=PATH - 用逗号分隔的路径来专门监视变化（默认值：观看所有内容）

+ --ignore=PATH- 要忽略的逗号分隔的路径字符串（anymatch -compatible definition）

+ --ignorePattern=RGXP-文件的正则表达式忽略（即.*\.jade）（不推荐使用赞成--ignore）

- --middleware=PATH - 导出要添加的中间件功能的.js文件的路径; 可以是没有路径的名称，也可以是引用middleware文件夹中捆绑的中间件的扩展名

+ --entry-file=PATH - 提供此文件（服务器根目录）代替丢失的文件（对单页应用程序有用）

+ --mount=ROUTE:PATH - 在定义的路线下提供路径内容（可能有多个定义）

+ --spa - 将请求从/ abc转换为/＃/ abc（方便单页应用）

+ --wait=MILLISECONDS - （默认100ms）等待所有更改，然后重新加载

+ --htpasswd=PATH - 启用期待位于PATH的htpasswd文件的http-auth

+ --cors - 为任何来源启用CORS（反映请求源，支持凭证的请求）

+ --https=PATH - 到HTTPS配置模块的路径

+ --proxy=ROUTE:URL - 代理ROUTE到URL的所有请求

+ --help | -h - 显示简洁的使用提示并退出

+ --version | -v` - 显示版本并退出


--------------------- 
