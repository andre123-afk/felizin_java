# Lab 02 · Builder · Reserva hotelera

**Tiempo: 10 minutos. Código completo, sin TODO.**

## Archivos y ejecución

Lee [Reserva.java](Reserva.java) → [ReservaBuilder.java](ReservaBuilder.java) y ejecuta [S12Lab02BuilderMain.java](S12Lab02BuilderMain.java). Copia todos los archivos del paquete s12lab02 bajo la raíz de código de tu proyecto personal.

## Actividad paso a paso

Una reserva exige huésped y fecha; desayuno, estacionamiento y lateCheckout son opciones. No se calculan precios ni disponibilidad real.

1. Lee Reserva: sus campos son finales y no ofrece setters. Después identifica en ReservaBuilder los datos temporales, los métodos que retornan this y la validación de build.
2. Predice qué ocurre al construir la primera reserva y reutilizar el builder con lateCheckout true. Ejecuta el Main y observa que la primera no se modifica.
3. Sigue en Debug cada build: se crea un producto nuevo. Señala la diferencia entre configurar el builder y cambiar una reserva ya construida.
4. El Main usa el huésped `Luis` y la fecha `LocalDate.of(2026, 3, 5)`. Ambas reservas reflejan esos datos y conservan sus distintas opciones de lateCheckout.
5. El bloque de validación crea `new ReservaBuilder().huesped("Ana").build()`: debe indicar `La fecha es obligatoria`. No cambies la lógica del builder. Esa validación impide publicar una reserva sin fecha.

La fecha fija se construye con año, mes y día; no se consulta el reloj. Constructor con pocos parámetros puede ser más simple para una reserva sin muchas opciones: menciona ese costo en una frase.

## Salida inicial esperada

```text
Luis | 2026-03-05 | desayuno=true | estacionamiento=true | lateCheckout=false
Luis | 2026-03-05 | desayuno=true | estacionamiento=true | lateCheckout=true
Primera conserva lateCheckout: false
Objetos distintos: true
Reserva rechazada: La fecha es obligatoria
```

**Comprobaciones y respuesta:** (1) Reserva de Luis con lateCheckout desactivado: la primera conserva `false`, como se esperaba. (2) La segunda reserva activa lateCheckout y es un objeto distinto; la reserva incompleta sin fecha se rechaza. El builder reúne opciones de forma legible y valida antes de crear el objeto, aunque un constructor simple sería más ligero si hubiera pocos campos.

No debes construir otro patrón ni dibujar un UML completo en este tiempo. Completa lo pendiente para la siguiente clase según indique el docente.
