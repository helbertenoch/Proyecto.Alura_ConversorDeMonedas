# 💱 Conversor de Monedas Java

Este proyecto es un **conversor de monedas** hecho en Java que utiliza la [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio en tiempo real.

### 🚀 Funcionalidades

- Conversión entre monedas:
  - USD ↔ ARS
  - USD ↔ BRL
  - USD ↔ PEN
- Entrada de valores por consola
- Manejo de errores y validación de entradas
- Llamadas HTTP y parseo de JSON usando `HttpClient` y `Gson`

### 🛠️ Tecnologías usadas

- Java 17+ (o compatible)
- [ExchangeRate-API](https://www.exchangerate-api.com/)
- [Gson](https://github.com/google/gson)

### 📦 Estructura del Proyecto

com.aluraprojecto.ConversorDeMonedas
├── Principal
│ └──Principal-java
├── ConsultaAPI
│ └── ConsultaAPI.java
├── Divisa
│ └── ValorDivisa.java

### 🧪 Ejecución

1. Clona el repositorio:
   git clone https://github.com/tuusuario/conversor-monedas-java.git
   cd conversor-monedas-java
2. Asegúrate de tener Java y Gson instalados.

3. Compila y ejecuta:
javac -cp gson-2.10.1.jar com/aluraprojecto/ConversorDeMonedas/**/*.java
java -cp .:gson-2.10.1.jar com.aluraprojecto.ConversorDeMonedas.Principal
📌 Nota: Reemplaza "fb478f1c74e9190de3a6c5cc" con tu propia API Key de ExchangeRate-API para que funcione correctamente.
