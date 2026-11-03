# Lab 03 · Prototype · Copia de rutinas

**Tiempo: 12 minutos. Código completo, sin TODO.**

## Archivos y ejecución

Lee [Ejercicio.java](Ejercicio.java) → [Rutina.java](Rutina.java) y ejecuta [S12Lab03PrototypeMain.java](S12Lab03PrototypeMain.java). Copia todos los archivos del paquete s12lab03 bajo la raíz de código de tu proyecto personal.

## Actividad paso a paso

Una rutina es una plantilla con ejercicios que tienen repeticiones modificables. Necesitamos personalizar una copia sin afectar los objetos de la original. Los valores son didácticos, no una rutina deportiva recomendada.

1. Antes de ejecutar, distingue las referencias base y personal. Predice si cambiar las repeticiones de personal alterará la plantilla.
2. Lee Rutina.copiar y Ejercicio.copiar. El primer método crea otra lista; el segundo crea cada elemento mutable de esa lista.
3. Ejecuta el Main. Comprueba identidad diferente, dos ejercicios en Base y tres en Personal. Los intentos inválidos no cambian el resumen.
4. Coloca un breakpoint en el ciclo de copia. Explica por qué `new ArrayList<>(ejercicios)` sin copiar los Ejercicio dejaría compartidos los elementos, aunque las listas fueran distintas.
5. El Main cambia `base.cambiarRepeticiones(1, 12)` después de crear y personalizar la copia, e imprime ambas rutinas. Base debe tener Flexiones=12; Personal debe conservar Flexiones=8.
6. El Main prueba un índice inexistente y repeticiones cero: ambas operaciones se rechazan y conservan el estado. Registra dos comprobaciones y una frase que distinga copiar de asignar otra referencia.

Repeticiones válidas: 1–100; nombres obligatorios. Rutina no entrega su lista ni las referencias de sus ejercicios internos. No implementes Cloneable ni una rutina adicional.

## Salida inicial esperada

```text
Objetos distintos: true
Base (2): [Sentadillas=10] [Flexiones=12]
Personal (3): [Sentadillas=15] [Flexiones=8] [Plancha=1]
Indice invalido: false
Repeticiones cero: false
Personal (3): [Sentadillas=15] [Flexiones=8] [Plancha=1]
```

**Comprobaciones y respuesta:** (1) Cambiar Base a Flexiones=12 no altera Personal, que conserva Flexiones=8. (2) El índice inválido y las repeticiones cero devuelven `false` y no cambian el resumen. Copiar crea otro objeto y duplica también sus elementos mutables; asignar otra referencia solo apunta al mismo objeto.

No debes construir otro patrón ni dibujar un UML completo en este tiempo. Completa lo pendiente para la siguiente clase según indique el docente.
