# 小小商城系统  - SSM版

练手 JavaWEB 项目，本版本为SSM版。本项目实现了通用 Mapper，免写 SQL，全自动处理关联查询。通过合理配置 MyBatis Generator 和自定义插件，灵活隔离手写代码和自动生成代码。实现了 BaseService 类对 Service 层进行抽象。通过拦截器实现了方法级粒度的鉴权，通过AOP实现了参数校验。

---------------------------


本项目的亮点：

 * 功能齐全，页面丰富，实现了小商城的大部分功能
 * 前端仿天猫2017页面，基于原生 CSS（前台）、Bootstrap（后台）、Jquery、Bootstrap Js 构建
 * 本项目为 Maven 项目，后端使用 Spring 4 + SpringMVC 4 + Myba
 tis 3.4 + aspectj 1.8
 * 实现了一个 **通用mapper**，免写 SQL，可进行单表和多表关联查询，自动插入一对多/多对一对象（注解配置关联对象，结合 MyBatis Generator ）
 * 实现了一个 **BaseService 类** ，集成了多条件的查询和增改删操作，普通 Service 只需写少量代码即可
 * 完全**隔离** MyBatis Generator 生成代码和额外手写代码，以支持可持续化部署，实现了**多个MyBatis Generator插件**，全部采用软删除
 * 通过拦截器和自定义注解实现了方法级粒度的**用户鉴权** ，不同用户组权限完全隔离
 * 通过 参数注解 进行方法级**数据校验**，无需额外配置校验类 （通过 AOP 切面实现）
 * 统一的错误处理
  
  
讲解文章：  
  * [小小商城项目概述 —— 需求分析、数据表设计、原型设计、多层结构设计、项目规划][4]
  * [SSM开发 | 合理配置 mybatis-generator，隔离机器生成代码和额外增加代码][5]
  * [SSM开发 | 开发自定义插件，使 mybatis-generator 支持软删除][6]
  * [SSM开发 | 实现 Mybatis 的通用 Mapper，免写 SQL 自动处理关联查询 （类hibernate）（mybatis-generator+自定义插件+自定义注解+静态代理+泛型+反射）][7]
  * [SSM开发 | 配合Mybatis，通过泛型实现 BaseService ，抽象增改删查方法][8]
  * [SSM开发 | 配合自定义注解 和 SpringMVC拦截器，实现 方法级粒度 用户鉴权][9]
  * [SSM开发 | 对 SpringMVC 传入参数 进行参数校验 （使用自定义AOP切面+自定义参数注解）][10]
  
  
功能： 

 - [x] 首页、分类页、搜索页、产品页
 - [x] 购物车页面、下单页、支付页及支付成功页
 - [x] 我的订单页、确认收货及成功页、评价页
 - [x] 登陆页、注册页
 - [x] 全部数据库的后台可视化管理
 - [x] 网站SEO设置、图片路径设置