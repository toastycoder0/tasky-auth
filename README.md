# Tasky Auth

### Variables de entorno

Las variables de entorno se pueden definir en un archivo `.env` en la raíz del proyecto o en el entorno de desarrollo. para ello mira el ejemplo `.env.example`.

### Instalar dependencias

```bash
./mvnw clean install
```

### Iniciar aplicación

```bash
./mvnw spring-boot:run
```

### Actualizar dependencias

```bash
./mvnw dependency:resolve
```

### Comandos de docker

Levantar la base de datos

```bash
docker-compose up -d
```

Iniciar la base de datos

```bash
docker-compose start
```

Para la base de datos

```bash
docker-compose stop
```

Eliminar la base de datos

```bash
docker-compose down
```
