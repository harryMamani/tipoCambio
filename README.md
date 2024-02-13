<div align="center">
  <h1 align="center">
    Tipo de cambio
    <br />
    <br />
  </h1>
</div>

## Crear imagen docker

Primero compilar el jar ejecutando el siguiente comando:

```bash
mvn clean install
```

Para crear la imagen ejecutar el siguiente comando:

```bash
docker build -t spring-boot-docker:spring-docker .
```

Para ejecutar la imagen ingresar el siguiente comando:

```bash
docker run -p 8080:8082 spring-boot-docker:spring-docker .
```
## Probar el api con Postman

Importar el archivo <b>tipo-cambio.postman_collection.json</b> en postman.

Para el crud de moneda se debe de primero crear el token con el login.

En la seccion Authorization seleccionar la opcion Basic Auth y usar las credenciales:

- **username: harry**
- **password: 123**

## Ver los metodos en Swagger Ui

ingresar al link:
[swagger](http://localhost:8080/tipo-cambio/swagger-ui/index.html)

