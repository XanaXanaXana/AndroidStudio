# AndroidStudio
# Android Skills Portfolio

**Equipo 1**  
Pérez Jiménez Xana Amalinalli– Desarrollador y diseñador

---

##  ¿Qué hace la aplicación?

Esta aplicación móvil contiene una colección de ejercicios prácticos en Android Studio, diseñados para practicar habilidades esenciales en el desarrollo móvil usando Java. Incluye funcionalidades como botones, entradas de texto, cálculos, visibilidad de elementos y navegación entre actividades.

---

##  Tipo de sistema

- Proyecto Móvil en **Java (Android Studio)**
- SDK mínimo: **API 24 (Android 7.0)**
- Librerías externas: **Ninguna**

---

##  Ejercicios incluidos
## 📂 Ejercicios incluidos

🔐 **LoginActivity**  
**Qué hace:**  
Pantalla inicial donde se ingresan usuario y contraseña.

**Funcionalidad:**  
Si los datos son correctos, permite pasar al menú principal (MainActivity).  
![](capturas/captura1.png)

---

🧭 **MainActivity (Menú de botones)**  
**Qué hace:**  
Pantalla con 10 botones, cada uno lleva a un ejercicio diferente.

**Funcionalidad:**  
Navegación sencilla a todas las actividades del portafolio.  
![](capturas/captura2.png)

---

1️⃣ **Ejercicio 1**  
**Qué hace:**  
Pantalla con un botón que al presionarse cambia el color del fondo.

**Funcionalidad:**  
Usa setBackground para cambiar el color del Layout.  
![](capturas/captura3.png)

---

2️⃣ **Ejercicio 2**  
**Qué hace:**  
Lista de ciudades (5 en total) con CheckBoxes.

**Funcionalidad:**  
Los CheckBoxes están alineados a la izquierda pero centrados en pantalla.  
![](capturas/captura4.png)  
![](capturas/captura5.png)

---

3️⃣ **Ejercicio 3**  
**Qué hace:**  
Tiene dos TextView (nombre y ciudad) y 4 botones.

**Funcionalidad:**  
- Mostrar/ocultar campo de nombre.  
- Mostrar/ocultar campo de ciudad.
![](capturas/captura6.png)

---

4️⃣ **Ejercicio 4**  
**Qué hace:**  
Un EditText donde se escribe una oración y dos botones con su respectiva etiqueta.

**Funcionalidad:**  
Cada botón transfiere el texto del EditText a su TextView.  
![](capturas/captura7.png)

---

5️⃣ **Ejercicio 5**  
**Qué hace:**  
Un EditText, una TextView y un botón.

**Funcionalidad:**  
- El texto se refleja en la etiqueta mientras se escribe.  
- El botón borra el contenido del EditText y la TextView.
![](capturas/captura8.png)

---

6️⃣ **Ejercicio 6**  
**Qué hace:**  
Tiene campos de nombre, ciudad y frase.

**Funcionalidad:**  
- Botón para activar los campos.  
- Botón para desactivarlos.  
- Botón que genera una frase con los datos.
![](capturas/captura9.png)

---

7️⃣ **Ejercicio 7**  
(Nota: Si me lo brincaste o no lo trabajamos directo, avísame si quieres una descripción base, pero parece que no fue parte directa de los que hicimos)  
![](capturas/captura99.png)

---

8️⃣ **Ejercicio 8**  
(Igual que el anterior, si lo omitimos, lo podemos describir si me das el tema que tenía pensado)  
![](capturas/captura999.png)

---

9️⃣ **Ejercicio 9**  
**Qué hace:**  
Igual al ejercicio anterior (nombre, ciudad, frase), pero enfocado en setEnabled.

**Funcionalidad:**  
Activa o desactiva los EditText, y muestra una frase combinada.  
![](capturas/captura9999.png)

---

🔟 **Ejercicio 10**  
**Qué hace:**  
Calcula área y perímetro de un círculo a partir del radio.

**Funcionalidad:**  
- Se ingresa un radio (máximo 2 decimales).  
- Al presionar enter, se calcula área y perímetro.  
- Si el valor es menor a 1, marca error en rojo.
![](capturas/captura99999.png)


**EN RESUMEN**


| Ejercicio | Descripción |
|----------|-------------|
| **LoginActivity** | Pantalla de inicio con validación de usuario y contraseña. |
| **MainActivity** | Menú principal con 10 botones para acceder a cada ejercicio. |
| **Ejercicio 1** | Botón que cambia el color del fondo al presionarse. |
| **Ejercicio 2** | CheckBoxes con nombres de ciudades, alineados y centrados. |
| **Ejercicio 3** | Botones que ocultan o muestran los campos de nombre y ciudad. |
| **Ejercicio 4** | Dos botones que copian una oración a distintas etiquetas. |
| **Ejercicio 5** | Refleja el texto mientras se escribe; botón para limpiar. |
| **Ejercicio 6** | Activa o desactiva campos de texto; genera frase con los datos. |
| **Ejercicio 9** | Igual que el 6, pero enfocado en habilitar y deshabilitar campos. |
| **Ejercicio 10** | Cálculo de área y perímetro a partir de un radio ingresado. |

> Todos los ejercicios tienen un botón para regresar al menú principal (`MainActivitybotones`).

---

## 🛠️ Requisitos Técnicos

- **SDK mínimo:** API 24 (Android 7.0) o superior  
- **Gradle:** Compatible con versiones recientes de Android Studio (Hedgehog o posterior)
- **Librerías externas:** No se usaron librerías externas como Retrofit, Glide, etc.
- **Buenas prácticas:**  
  - Variables descriptivas  
  - Organización por actividad  
  - Botón de navegación de regreso incluido en todos

---

## Pasos para instalar y ejecutar

1. **Descarga el proyecto**:
   - Opción 1: Clonar con Git  
     ```bash
     git clone https://github.com/tu-usuario/android-skills-portfolio.git
     ```

2. **Abrir el proyecto en Android Studio**:
   - Selecciona **"Open an existing project"** y elige la carpeta del proyecto.

3. **Sincronizar el proyecto**:
   - Android Studio descargará las dependencias automáticamente.
   - Si no, haz clic en **"Sync Now"** cuando aparezca el aviso.

4. **Configurar un emulador o conecta tu celular**:
   - Usa Android 7.0 (API 24) o superior.
   - Si es un celular físico, activa **Depuración por USB**.

5. **Ejecutar la app**:
   - Haz clic en el botón **Run ▶️** y selecciona el dispositivo.
