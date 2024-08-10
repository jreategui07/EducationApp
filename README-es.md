# Education App

<table>
  <tr>
    <td><img src="./assets/logo/android-logo.png" width="120" /></td>
    <td><img src="./assets/logo/kotlin-logo.png" width="410" /></td>
  </tr>
</table>

## Descripción

Esta aplicación de Android, desarrollada con XML y Kotlin, implementa un adaptador RecyclerView con un diseño personalizado, SharedPreferences para la persistencia de datos y Gson para la serialización y deserialización de objetos. La aplicación permite a los usuarios ingresar su nombre de usuario, ver lecciones en su navegador a través de la navegación desde la aplicación y marcarlas como completadas, guardando el progreso del usuario en el almacenamiento para futuras sesiones. Se utilizan interfaces para manejar estas interacciones de manera limpia, asegurando una base de código modular y mantenible. Además, la aplicación implementa SnackBars, proporcionando retroalimentación rápida al usuario. Este proyecto muestra prácticas modernas de desarrollo de Android, incluyendo diseños personalizados, adaptadores RecyclerView, manejo de eventos basado en interfaces, persistencia de datos a través de SharedPreferences, serialización y deserialización de objetos con Gson, así como notificaciones amigables para el usuario con SnackBars.

## Características

- **Kotlin**: Utilizado para desarrollar la lógica de la aplicación.
- **XML**: Utilizado para diseñar la interfaz de usuario.
- **Binding**: Para un acceso eficiente y seguro a los componentes de la interfaz de usuario.
- **OOP**: Demuestra los principios de programación orientada a objetos.
- **RecyclerView Adapter**: Para gestionar y mostrar eficientemente una lista de elementos de datos en un RecyclerView.
- **Custom Layout**: Para diseñar una fila personalizada específicamente para el adaptador.
- **Interface**: Para manejar las interacciones del usuario y proporcionar una separación clara de responsabilidades.
- **Snackbar**: Para proporciona retroalimentación rápida a los usuarios activada mediante eventos de click.
- **Shared Preferences**: Para almacenar y recuperar pequeñas cantidades de datos en forma de pares key-value.
- **Gson**: Para convertir objetos a su representación JSON y viceversa.

## Configuración Necesaria

- No se requiere configuración adicional.

## Demostración

A continuación, algunas capturas de pantalla de la aplicación:

<table>
  <tr>
    <td><img src="./assets/demo_your_name_screen.png"/></td>
    <td><img src="./assets/demo_lessons_list_1_screen.png" ></td>
  </tr>
  <tr>
    <td><img src="./assets/demo_lessons_detail_screen.png"></td>
    <td><img src="./assets/demo_lessons_list_2_screen.png" ></td>
  </tr>
  <tr>
    <td><img src="./assets/demo_welcome_back_screen.png"></td>
  </tr>
</table>

## License [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

The MIT License (MIT)

- **Copyright (c) 2024 Jonathan Reátegui**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
