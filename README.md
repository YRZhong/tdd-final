# Tasking

### LockerRobotManager管理一个S号的Locker，一个PrimaryLockerRobot和一个SuperLockerRobot。PrimaryLockerRobot管理一个M号Locker，SuperLockerRobot管理一个L号Locker。

- given S号Locker还有空间，普通顾客拿S号找小樱，when 存包，then 小樱将包存入S号Locker 将返回的S票据交给顾客。
- given S号Locker还有空间，VIP顾客拿S号找LockerRobotManager，when 存包，then LockerRobotManager将包存入S号Locker 将返回的S票据交给顾客。
- given M号Locker还有空间，普通顾客拿M号找小樱，when 存包，then 小樱将包交给PrimaryLockerRobot存入M号Locker，将返回的M票据交给顾客。
- given M号Locker还有空间，VIP顾客拿M号找LockerRobotManager，when 存包，then LockerRobotManager将包交给PrimaryLockerRobot存入M号Locker，将返回的M票据交给顾客。
- given L号Locker还有空间，普通顾客拿L号找小樱，when 存包，then 小樱将包交给SuperLockerRobot存入L号Locker，将返回的L票据交给顾客。
- given L号Locker还有空间，VIP顾客拿L号找LockerRobotManager，when 存包，then LockerRobotManager将包交给SuperLockerRobot存入L号Locker，将返回的L票据交给顾客。
- given S号Locker已满，普通顾客拿S号找小樱，when 存包，then 提示Locker已满。
- given S号Locker已满，VIP顾客拿S号找LockerRobotManager，when 存包，then 提示Locker已满。
- given M号Locker已满，普通顾客拿M号找小樱，when 存包，then 提示Locker已满。
- given M号Locker已满，VIP顾客拿M号找LockerRobotManager，when 存包，then 提示Locker已满。
- given L号Locker已满，普通顾客拿M号找小樱，when 存包，then 提示Locker已满。
- given L号Locker已满，VIP顾客拿M号找LockerRobotManager，when 存包，then 提示Locker已满。
- given 普通顾客存入S号包后拿S票据找小樱，when 取包，then 返回存入的包。
- given 普通顾客存入S号包后拿M/L票据找小樱，when 取包，then 提示票的型号错误。
- given VIP顾客存入S号包后拿S票据找LockerRobotManager，when 取包，then 返回存入的包。
- given VIP顾客存入S号包后拿M/L票据找LockerRobotManager，when 取包，then 提示票的型号错误。
- given 普通顾客存入M号包后拿M票据找小樱，when 取包，then 小樱将票交给PrimaryLockerRobot返回存入的包。
- given 普通顾客存入M号包后拿S/L票据找小樱，when 取包，then 小樱将票交给PrimaryLockerRobot提示票的型号错误。
- given VIP顾客存入M号包后拿M票据找LockerRobotManager，when 取包，then LockerRobotManager将票交给PrimaryLockerRobot返回存入的包。
- given VIP顾客存入M号包后拿S/L票据找LockerRobotManager，when 取包，then LockerRobotManager将票交给PrimaryLockerRobot提示票的型号错误。
- given 普通顾客存入L号包后拿L票据找小樱，when 取包，then 小樱将票交给SuperLockerRobot返回存入的包。
- given 普通顾客存入L号包后拿S/M票据找小樱，when 取包，then 小樱将票交给SuperLockerRobot提示票的型号错误。
- given VIP顾客存入L号包后拿L票据找LockerRobotManager，when 取包，then LockerRobotManager将票交给SuperLockerRobot返回存入的包。
- given VIP顾客存入L号包后拿S/M票据找LockerRobotManager，when 取包，then LockerRobotManager将票交给SuperLockerRobot提示票的型号错误。