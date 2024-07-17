# Proyecto Android con Retrofit

Este proyecto de ejemplo está desarrollado en Android Studio utilizando Java y tiene como objetivo principal servir como material educativo para ejemplificar el uso de Retrofit en aplicaciones Android.

## Descripción

El proyecto es una simple aplicación que consume una API REST para mostrar una lista de usuarios. Utiliza Retrofit para realizar las solicitudes HTTP y manejar las respuestas de la API.

## Características

- Consumo de una API REST utilizando Retrofit.
- Manejo de peticiones y respuestas HTTP.
- Parseo de datos JSON a objetos Java utilizando Gson.
- Diseño de unas interfaces de usuario simples.

## Requisitos

- Android Studio Koala | 2024.1.1.
- JDK 1.8 o superior.
- Conexión a Internet para consumir la API REST.

## Instalación

1. Clonar el repositorio:
    ```sh
    git clone https://github.com/jornic/AndroidConRetrofit.git
    ```

2. Abrir el proyecto en Android Studio:
    - Abrir Android Studio.
    - Seleccionar "Open an existing Android Studio project".
    - Navegar hasta la carpeta del proyecto clonado y seleccionarla.

3. Configurar la API Base URL:
    - Abrir el archivo `Somee.java`.
    - Reemplazar `BASE_URL` con la URL de la API que desees consumir.

4. Sincronizar el proyecto con Gradle:
    - En Android Studio, ir a `File` -> `Sync Project with Gradle Files`.

## Uso

1. Ejecutar la aplicación:
    - Conectar un dispositivo Android o iniciar un emulador.
    - Hacer clic en el botón "Run" en Android Studio.

2. Interactuar con la aplicación:
    - La aplicación mostrará una lista de usuarios obtenidos de la API.
<!--
## Estructura del Proyecto

- `MainActivity.java`: Actividad principal que muestra la lista de usuarios.
- `UserAdapter.java`: Adaptador para el RecyclerView que muestra los usuarios.
- `User.java`: Clase modelo para representar los datos del usuario.
- `ApiClient.java`: Clase que configura y proporciona la instancia de Retrofit.
- `ApiService.java`: Interfaz que define los endpoints de la API.
-->
## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:

1. Hacer un fork del repositorio.
2. Crear una rama para tu feature (`git checkout -b feature/NombreFeature`).
3. Commit tus cambios (`git commit -am 'Agregar nueva feature'`).
4. Push a la rama (`git push origin feature/NombreFeature`).
5. Crear un nuevo Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

Si tienes alguna pregunta o sugerencia, no dudes en crear un issue en el repositorio.
