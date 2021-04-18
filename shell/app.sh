docker run -d \
  --name app \
  -e SPRING_DATASOURCE_URL=jdbc:mariadb://mariadb:3306/employees \
  -p 8080:8080 \
  --link mariadb \
  docker.io/nogada/employees:v1 