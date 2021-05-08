# build에 사용할 기준 Container 선언. 
# as [Name]으로 빌드 컨테이너를 저장소로 사용하기 위한 이름 지정
FROM maven:3.8.1-jdk-11 AS build

# 필요한 파일을 local에서 container로 복사
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
# RUN mvn -f /usr/src/app/pom.xml clean dependency:go-offline -B
# maven build를 실행
RUN --mount=type=cache,target=~/.m2 mvn -f /usr/src/app/pom.xml clean package -DskipTests

# Target 컨테이너의 기준 container 선언
FROM openjdk:11

# 작업 경로 생성
RUN mkdir /app
# 작업/현재 경로 설정 cd와 같은 기능
WORKDIR /app

# 필요한 파일을 build 컨테이너에서 target으로 복사
# 'build'는 위에서 선언한 컨테이너 이름
COPY --from=build /usr/src/app/target/*.jar /app/app.jar
# 외부로 노툴할 port 
EXPOSE 8080
#실행 명령어
ENTRYPOINT ["java","-jar","/app/app.jar"]