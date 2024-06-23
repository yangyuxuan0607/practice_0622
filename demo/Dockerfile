# 使用官方的OpenJDK 21镜像作为基础镜像
FROM openjdk:21-jdk

# 将本地文件系统中的 JAR 文件添加到镜像中
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar

# 暴露容器端口
EXPOSE 8080

# 定义启动命令
ENTRYPOINT ["java", "-jar", "/app.jar"]
