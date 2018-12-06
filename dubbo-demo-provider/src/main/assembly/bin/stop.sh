#!/bin/bash
cd `dirname $0`
cd ../

# 服务根目录
DEPLOY_DIR=`pwd`
readonly DEPLOY_DIR
# conf目录
CONF_DIR=${DEPLOY_DIR}/conf
readonly CONF_DIR
# 服务名称(与pom.xml中的<artifactId>标签值保持一致，若<build>标签内设置了服务包名，请与设置的包名值保持一致（注：不含版本号！）)
SERVER_NAME="dubbo-demo-provider"
readonly SERVER_NAME

echo -e "\033[36m ------------ Stopping service start ------------ \033[0m"
# 服务根目录的父级目录
DEPLOY_PARENT_DIR=${DEPLOY_DIR%/*}

# 查找相应服务并kill掉
PIDS=`ps -ef | grep java | grep "${DEPLOY_PARENT_DIR}" | grep "${SERVER_NAME}" | awk '{print $2}'`
if [ -z "$PIDS" ]; then
        # 服务未启动
        echo -e "\033[31m WARN: The service of ${SERVER_NAME} does not exist ! \033[0m"
    else
        # 遍历kill掉相应服务
        for PID in ${PIDS} ; do
            kill ${PID} > /dev/null 2>&1
        done
        echo -e "\033[32m The service of ${SERVER_NAME} stop successfully ! \033[0m"
        echo -e "\033[32m PIDS: ${PIDS}  \033[0m"
fi

echo -e "\033[36m ------------ Stopping service end ------------ \033[0m"