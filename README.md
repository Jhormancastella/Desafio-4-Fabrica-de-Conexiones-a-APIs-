# 🎯 Desafío 4: Fábrica de Conexiones a APIs 🌐

## 📌 Descripción

Se requiere un sistema que pueda conectarse a diferentes APIs según la necesidad:

- **REST API**
- **GraphQL API**
- **SOAP API**

Cada API debe permitir:

1. **Hacer una solicitud** (`makeRequest(endpoint)`)
2. **Obtener datos** (`getData()`)

---

## 🛠️ Tareas

1. **Implementa Abstract Factory** para manejar múltiples tipos de API.
2. **Cada API debe tener su propia fábrica concreta**.
3. **Permite al código cliente** seleccionar qué tipo de API utilizar sin conocer su implementación.

---

## 🚀 Estructura del Proyecto

### 📂 Clases Principales

1. **Interfaces:**
   - `APIFactory`: Define los métodos para crear conexiones a APIs.
   - `API`: Define los métodos comunes para todas las APIs (`makeRequest(endpoint)`, `getData()`).

2. **Fábricas Concretas:**
   - `RESTAPIFactory`: Implementa `APIFactory` para crear conexiones a REST API.
   - `GraphQLAPIFactory`: Implementa `APIFactory` para crear conexiones a GraphQL API.
   - `SOAPAPIFactory`: Implementa `APIFactory` para crear conexiones a SOAP API.

3. **APIs Concretas:**
   - `RESTAPI`: Implementa `API` para hacer solicitudes y obtener datos de una REST API.
   - `GraphQLAPI`: Implementa `API` para hacer solicitudes y obtener datos de una GraphQL API.
   - `SOAPAPI`: Implementa `API` para hacer solicitudes y obtener datos de una SOAP API.

4. **Cliente:**
   - `Client`: Solicita un tipo de API y utiliza la fábrica correspondiente para obtener la conexión.

---

## 🚀 Instalación y Configuración

### 📋 Requisitos Previos

- **Java Development Kit (JDK) 17 o superior**
- **Git instalado en tu sistema**

### 📥 Clonar Repositorio

```bash
git clone https://github.com/tu-usuario/fabrica-conexiones-apis.git
```

### 🛠️ Compilar y Ejecutar

1. Abre una terminal en la carpeta del proyecto.
2. Compila los archivos Java:

```bash
javac -d . *.java
```

3. Ejecuta el programa:

```bash
java Client
```

---

## 🛠️ Uso

1. **Selección de API:**
   - El programa solicitará al usuario seleccionar un tipo de API (REST, GraphQL, SOAP).

2. **Hacer una Solicitud:**
   - Una vez seleccionada la API, se hará una solicitud a un endpoint.

3. **Obtener Datos:**
   - Se obtendrán y mostrarán los datos de la API.

---

## 📋 Ejemplo de Ejecución

```plaintext
Seleccione el tipo de API (REST, GraphQL, SOAP): REST
Haciendo solicitud a REST API en el endpoint: /users
Datos obtenidos: { "id": 1, "name": "John Doe" }
```

---

## 📋 Características

- **Soporte para múltiples tipos de API** (REST, GraphQL, SOAP).
- **Uso del patrón Abstract Factory** para garantizar flexibilidad y escalabilidad.
- **Interfaz común** para todas las APIs, permitiendo operaciones como hacer solicitudes y obtener datos.

---

## 🚨 Estado del Ejercicio

- **Culminado.**

---

## 👤 Autor

- **Jhorman Jesús Castellanos Morales**