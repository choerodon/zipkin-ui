FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.6.0
COPY app.jar /zipkin-ui.jar
ENTRYPOINT exec java $JAVA_OPTS  -jar /zipkin-ui.jar
