# Lab 01 · Abstract Factory · Documentos por familia

**Tiempo: 11 minutos. Código completo, sin TODO.**

## Archivos y ejecución

Lee [CalculadorImpuesto.java](CalculadorImpuesto.java) → [FormatoFactura.java](FormatoFactura.java) → [FabricaDocumentos.java](FabricaDocumentos.java) → [FabricaAlba.java](FabricaAlba.java) → [FabricaBoreal.java](FabricaBoreal.java) → [EmisorFactura.java](EmisorFactura.java) y ejecuta [S12Lab01AbstractFactoryMain.java](S12Lab01AbstractFactoryMain.java). Copia todos los archivos del paquete s12lab01 bajo la raíz de código de tu proyecto personal.

## Actividad paso a paso

Dos países ficticios, Alba y Boreal, utilizan cálculo de impuesto y formato de factura propios. Sus tasas didácticas son 5 % y 10 %. No representan reglas tributarias reales.

1. Identifica los dos tipos de producto y las dos fábricas. Lee también ImpuestoAlba/ImpuestoBoreal y FacturaAlba/FacturaBoreal, en el mismo paquete.
2. Sigue EmisorFactura.emitir: debe obtener calculador y formato de la misma fábrica recibida. Predice el impuesto y el total para base 10000.
3. Ejecuta el Main y compara las dos salidas. El cliente permanece igual; la fábrica decide la familia.
4. El Main usa la base 20000 en ambas llamadas. Alba debe producir impuesto 1000 y total 21000; Boreal 2000 y 22000.
5. Explica por qué escoger calculador de Alba y formato de Boreal rompería la consistencia prevista. ¿Qué cambiaría al agregar otra familia y qué al agregar un tercer tipo de producto?

**Contrato de base:** pesos enteros entre 0 y 1000000, múltiplos de 100. Los calculadores rechazan otros valores antes de operar. Con base cero, impuesto y total son cero. No cambies las tasas ni añadas precios para resolver la actividad. El código completo está en este paquete.

## Salida inicial esperada

```text
FACTURA ALBA base=20000 impuesto=1000 total=21000
FACTURA BOREAL base=20000 impuesto=2000 total=22000
```

**Comprobaciones y respuesta:** (1) Alba con base `20000`: impuesto `1000`, total `21000`, resultado esperado y obtenido. (2) Boreal con base `20000`: impuesto `2000`, total `22000`, resultado esperado y obtenido. Combinar el calculador de Alba con el formato de Boreal mezclaría familias; una fábrica adicional agrega una familia, mientras que un tercer producto requiere ampliar la interfaz de fábrica y sus implementaciones.

No debes construir otro patrón ni dibujar un UML completo en este tiempo. Completa lo pendiente para la siguiente clase según indique el docente.
