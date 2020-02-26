# base

项目说明：

1、项目使用得为mysql数据库，数据库脚本文件在项目的resources下的sql文件夹中的test.sql，要启动项目需要先将sql运行到本地或者服务器的数据库中
2、创建数据库表成功之后，需要修改resources下的application.yml配置文件中的数据库连接地址及用户名密码等信息。
3、完成上述配置之后，直接运行com.example.demo包下的DemoApplication类中的main函数
4、启动成功之后，打开浏览器访问http://localhost:8080/user/index地址
5、由于项目比较简单，没有做很多细致化的东西，如非空校验，增删改之后的跳转列表页
