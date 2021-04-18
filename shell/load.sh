docker run -d \
  --name employeedb \
  -e MYSQL_ROOT_PASSWORD=passw@rd \
  -p 3306:3306 \
  nogada/mariadb-employee