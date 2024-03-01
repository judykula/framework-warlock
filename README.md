
# 概要

整套架构的项目名称以DOTA2中的英雄名称命名

## warlock

framework jdbc模块

## 1.0.0

引入合适的ORM(jpa)  以及相关插件

定义ID Generator Entity:
```
- AbstractEntity: 定义公共基础字段：比如创建时间
- AbstractAutoIncIdEntity: 设定ID自增策略
- AbstractSpecifyIdEntity: 设定ID有程序设定
```
 
