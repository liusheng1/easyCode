FROM java:8u111

VOLUME /tmp

ADD easyCode-0.0.1.jar app.jar

EXPOSE 80

ENTRYPOINT ["java","-jar","/app.jar"]

# Ubuntu 时区
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime