# ¿Se recogen todos los valores?¿Qué ocurre?
Sí, si utilizas un único hilo que recorre el bucle de 0 a 99, todos los valores se procesan y se recogen de forma ordenada sin perder ninguno.
Si pones a varias hebras a modificar la misma variable al mismo tiempo, ocurre un conflicto de concurrencia. Los hilos pueden pisarse entre sí y hacer que se pierdan datos o los números salgan desordenados.

# Intenta solucionar los problemas detectados.

Añadir la palabra synchronized a los métodos de la clase compartida. Esto actúa como un cerrojo para que solo un hilo a la vez pueda acceder a la variable y modificarla de forma segura.