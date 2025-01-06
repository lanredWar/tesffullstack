Antes de ejecutar el backend, debes compilar el proyecto. Si tienes Maven instalado, puedes compilar el proyecto desde la terminal utilizando el siguiente comando:

bash
Copiar código
mvn clean install
Este comando descargará las dependencias necesarias y construirá el proyecto.

4. Ejecutar el proyecto Backend:
Una vez que hayas creado la base de datos y configurado la conexión, puedes ejecutar el proyecto backend utilizando el siguiente comando:

bash
Copiar código
mvn spring-boot:run
Este comando iniciará el servidor Spring Boot y pondrá en marcha la API backend en el puerto predeterminado (usualmente 8080)