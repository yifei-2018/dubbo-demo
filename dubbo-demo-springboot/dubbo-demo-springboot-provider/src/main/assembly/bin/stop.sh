#!/bin/bash
cd `dirname $0`
cd ../

# 服务根目录
DEPLOY_DIR=`pwd`
readonly DEPLOY_DIR
# 服务名称（服务根目录名称）
SERVER_NAME=${DEPLOY_DIR##*/}
readonly SERVER_NAME

echo -e "\033[36m ------------ Stopping service start ------------ \033[0m"

# 查找相应服务进程
P_ID_LIST=`ps -ef | grep java | grep "${DEPLOY_DIR}/" | awk '{print $2}'`
readonly P_ID_LIST
if [ -z "${P_ID_LIST}" ]; then
    # 服务未启动
    echo -e "\033[31m WARN: The service of \"${SERVER_NAME}\" does not exist ! \033[0m"
else
    # 遍历kill掉相应服务进程
    for PID in ${P_ID_LIST} ; do
        kill ${PID} > /dev/null 2>&1
    done
    echo -e "\033[32m The service of \"${SERVER_NAME}\" stops successfully ! \033[0m"
    echo -e "\033[32m P_ID_LIST: ${P_ID_LIST}  \033[0m"
fi

echo -e "\033[36m ------------ Stopping service end ------------ \033[0m"
