# Sử dụng hình ảnh Java JDK
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc
WORKDIR /app

# Copy tệp JAR vào container
COPY target/*.jar app.jar

# Expose cổng
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
