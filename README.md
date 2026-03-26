# POO\_Tarea

\# 📘 POO - Encapsulación en Java



Este repositorio contiene una serie de ejercicios prácticos desarrollados en Java enfocados en el uso de \*\*Programación Orientada a Objetos (POO)\*\*, especialmente el concepto de \*\*encapsulación\*\*.



La encapsulación consiste en \*\*proteger los datos de una clase y acceder a ellos mediante métodos (getters y setters)\*\*, lo que permite mayor control, seguridad y organización del código.



\---



\## 🎯 Objetivos



\- Aplicar conceptos básicos de POO:

&#x20; - Clases y objetos

&#x20; - Atributos y métodos

&#x20; - Constructores

\- Implementar \*\*encapsulación\*\*

\- Practicar lógica de programación en Java

\- Mejorar la organización del código



\---



\## 📚 Ejercicios



\### 👤 Clase Persona

\- Atributos: nombre, apellido, edad  

\- Constructor con parámetros  

\- Método `mostrar()`  



🔹 Se crean 3 objetos y se muestran sus datos.

🔹Adicional se agrega Set y Get de prueba para modificar los datos (quitar los `\*/ `, `/\*` para imprimir los datos modificdos)



\---



\### 🔷 Clase Rectángulo

\- Atributos: base, altura  

\- Métodos:

&#x20; - `area()`

&#x20; - `perimetro()`  



🔹 Se comparan dos rectángulos para determinar cuál tiene mayor área.



\---



\### 🛒 Clase Producto

\- Atributos: código, nombre, precio  

\- Método:

&#x20; - `aplicarDescuento(double porcentaje)`  



🔹 Se aplican descuentos diferentes a dos productos.



\---



\### 💳 Clase Cuenta

\- Atributos: titular, saldo  

\- Métodos:

&#x20; - `depositar(double monto)`

&#x20; - `retirar(double monto)` (sin permitir saldo negativo)  



🔹 Se realizan varias operaciones y se muestra el saldo final.



\---



\### 📖 Clase Libro

\- Atributos: título, autor, páginas  

\- Método:

&#x20; - `esLargo()`  



🔹 Retorna `true` si el libro tiene más de 300 páginas.



\---



\### 🧮 Clase Calculadora

\- Métodos:

&#x20; - `sumar`

&#x20; - `restar`

&#x20; - `multiplicar`

&#x20; - `dividir` (validando división entre cero)  



🔹 Se prueban operaciones básicas.



\---



\### 📅 Clase Fecha

\- Atributos: día, mes, año  

\- Método:

&#x20; - `esValida()`  



🔹 Valida:

\- Día entre 1 y 31  

\- Mes entre 1 y 12  



\---



\## 🔒 Encapsulación aplicada



En las clases del proyecto:



\- Los atributos se declaran como `private`

\- Se utilizan métodos `get` y `set` para acceder y modificar valores

\- Se controlan datos inválidos (ejemplo: saldo negativo, fechas incorrectas)



Esto permite:



\- ✔ Mayor seguridad  

\- ✔ Código más mantenible  

\- ✔ Mejor organización  



\---

