# 📦 API REST – Gestión de Solicitudes (Spring Boot)

API REST desarrollada con **Spring Boot** para la gestión de solicitudes, aplicando una arquitectura por capas y buenas prácticas de desarrollo backend.  
El proyecto fue construido con un enfoque académico–profesional, simulando un sistema real de creación, consulta, actualización y eliminación de solicitudes.

Su objetivo es demostrar el uso correcto de **Spring Boot**, patrones de diseño, una adecuada separación de responsabilidades y el uso de contenedorización con Docker.

---

## 🐳 Contenedorización con Docker

La aplicación está contenedorizada usando Docker, lo que permite:
- Despliegue consistente en distintos entornos
- Aislamiento de dependencias
- Ejecución reproducible en local y producción
- Despliegue como Web Service en plataformas cloud (Render)

---

## 🧱 Arquitectura del proyecto
El sistema sigue una **arquitectura en capas**, lo que facilita el mantenimiento, la escalabilidad y las pruebas.

**Capas implementadas:**
- **Controller**: Exposición de endpoints REST.
- **Service**: Lógica de negocio y orquestación.
- **Repository**: Acceso al medio de persistencia.
- **Model**: Entidades y DTOs.
- **Mapper**: Conversión entre entidades y DTOs.

---

## 📁 Estructura de paquetes

```text
src/main/java
│
├── controllers
│   └── SolicitudRestController.java
│
├── models
│   └── SolicitudEntity.java
│
├── repositories
│   └── SolicitudRepository.java
│
├── services
│   ├── DTO
│   │   └── SolicitudDTO.java
│   │
│   ├── mapper
│   │   └── Mapper.java
│   │
│   ├── ISolicitudService.java
│   └── SolicitudServiceImpl.java
│
└─- Application.java

```

---
## 🧠 Patrones y principios aplicados

- **MVC (Model–View–Controller)**  
  La vista es consumida por un cliente externo (frontend o cliente REST).

- **Arquitectura en capas**

- **DTO (Data Transfer Object)**  
  Desacopla la capa de persistencia de la capa de presentación.

- **Repository Pattern**  
  Encapsula el acceso a datos y evita que la lógica de negocio interactúe directamente con la base de datos.

- **Facade Pattern**  
  Proporciona una interfaz simplificada para interactuar con la lógica de negocio a través de la capa de servicios.

- **Inyección de dependencias**  
  Implementada mediante anotaciones de Spring (`@Service`, `@Repository`, `@Autowired`).

---

## ⚙️ Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- ModelMapper
- Maven
- Docker

---

## ▶️ Endpoints Y Ejecución del proyecto

Base URL: La aplicación está desplegada como Web Service en Render, utilizando Docker.

  https://api-rest-gestion-solicitudes.onrender.com/api

| Método | Endpoint | Descripción |
|------|--------|----|
| GET | `/solicitudes` | Obtener todas las solicitudes |
| GET | `/solicitudes/{id}` | Obtener solicitud por ID |
| POST | `/solicitudes` | Crear una nueva solicitud |
| PUT | `/solicitudes/{id}` | Actualizar una solicitud |
| DELETE | `/solicitudes/{id}` | Eliminar una solicitud |

> Para ver el detalle completo de cada endpoint, parámetros y ejemplos, consulte **Swagger UI**.

---

## Documentación de la API (Swagger / OpenAPI)

La API cuenta con **documentación interactiva** generada automáticamente mediante **Swagger (OpenAPI 3)**, lo que permite:

- Visualizar todos los endpoints disponibles
- Probar las operaciones directamente desde el navegador
- Consultar descripciones, parámetros y tipos de datos
- Facilitar el consumo de la API por clientes externos

### 🔗 Acceso a Swagger UI

Documentación interactiva disponible en:

https://api-rest-gestion-solicitudes.onrender.com/swagger-ui.html

> La documentación se genera automáticamente a partir de las anotaciones del código (`@Operation`, `@Tag`, etc.).

---
