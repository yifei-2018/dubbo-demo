部署说明：
    1、根据实际需要，修改conf目录下的application.properties文件中相应的配置，如：grpc服务的端口、tomcat端口等；
    2、根据实际需要，修改conf目录下的applicationContext.xml文件中相应的配置，如：数据源信息、事务处理等；
    3、根据实际需要，修改conf目录下的init.properties文件中相应的配置，如：数据源信息、数据库连接池、支付环境等；
    4、根据实际需要，修改conf目录下的accounting-web-consumer.xml和spring-dubbo.xml文件中相应的配置，如：zookeeper注册中心的地址、订阅的服务等；
    5、根据实际需要，修改conf目录下的logback.xml文件中相应的配置，如：日志存储位置、日志输出级别等；
    6、根据实际需要，修改conf目录下的CLCDic.xml文件中相应的配置，如：文献分类等；
    7、若操作系统为window,运行bin目录下的start.bat文件即可启动服务；若操作系统为Linux,运行bin目录下的start.sh文件即可启动服务；

注：1、若在Linux操作系统下，执行.sh文件出现“$'\r': 未找到命令”、“附近有语法错误”等错误，先通过以下步骤尝试解决：
        1）.通过“vim ***.sh”、“:set ff”来查看该.sh文件的编码格式（“***”为文件名，替换即可）；
        2）.若执行结果为“fileformat=dos”,则通过“:set ff=unix”、“:wq”命令来修改文件编码；若执行结果为“fileformat=unix”,说明shell脚本格式正确，但存在错误，请联系开发人员；
    2、若在Linux操作系统下，执行.sh文件出现“权限不够”错误，请通过“chmod +x ***.sh”命令来给相应的.sh文件添加可执行权限。