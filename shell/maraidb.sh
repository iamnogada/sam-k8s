docker run -d \
  --name mariadb \
  -e MYSQL_ROOT_PASSWORD=passw@rd \
  -p 3306:3306 \
  mariadb