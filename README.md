Ejercicio 1 [2,5 puntos]
Queremos mostrar tablas de multiplicar realizando los cálculos utilizando las sumas en vez de
multiplicaciones (por ejemplo: 3 x 2 = 3 + 3). No se puede usar el símbolo de multiplicar.
-Escribir un subprograma que reciba un número y muestre por pantalla su tabla de multiplicar del 1 al 10
mediante sumas sucesivas. (1,5 puntos)
- Escribir un programa que, haciendo uso del subprograma desarrollado en el punto anterior, muestre varias
tablas de multiplicar que le indique el usuario. Para ello, se le solicitará la primera y la última, y se mostrarán
todas las comprendidas entre esos valores límite. (1 punto)


Ejercicio 2 [2,5 puntos]
Se desea escribir un programa que permita operar con números naturales entre 1 y 999 ingresados
por el usuario. Se estará leyendo números hasta que el usuario pulse un número no valido (menor que 1 o
mayor de 999. Ese número que termina el proceso no debe procesarse).
Al finalizar (después de que el usuario haya pulsado un valor no válido) debe mostrarnos los siguientes
resultados: si se ha procesado algún número perfecto o no (mostrará “si” hay perfectos o “no” hay perfectos,
usando el operador condicional), cuántos números pares se han procesado, la suma de los impares procesados
y cuales son el mayor y el menor de los números procesados.
Un número es perfecto y es igual a la suma de sus divisores. Por ejemplo, el 4 no lo es (4 <> 1+2) pero
el 6 si (6 == 1+2+3). Se debe definir un subprograma que nos diga si un número es perfecto, y utilizarlo en el
programa principal. (1 punto el subprograma y 1,5 puntos el resto del programa).


Ejercicio 3 [3 puntos]
Crea en un paquete una clase pública Fecha que incluya lo normal, es decir, los 3 atributos día, mes y
año (el mes puede ser enum (como en la tarea) o no), un constructor que los reciba como parámetro, los 3
métodos set y los 3 get, y un toString que nos muestre la fecha. (1 punto).
Además, debe tener los métodos siguientes: (1 punto)
• igual_a_mi: Recibe una fecha y nos dice si es igual a la del objeto que ejecuta el método o no.
• anterior_a_mi: Recibe una fecha y nos dice si es anterior a la del objeto que ejecuta el método o no.
• incrementar_dias: Recibe un número de días y traslada la fecha del objeto que ejecuta el método esa
cantidad de días. Podemos suponer meses de 30 días.
• dias_hasta_fecha: Reciba una fecha y nos dice cuantos días faltan desde la fecha del objeto que la ejecuta
hasta la que se recibe.
Crea en el mismo paquete una clase GestionFechas que incluya un programa principal que cree 3
fechas de días, meses y años diferentes (inventa los datos), y usando las funciones anteriores: (1 punto)
- Las muestre por pantalla ordenadas cronológicamente.
- Nos muestre los días que faltan para llegar a la fecha mayor desde la fecha menor.
- Incremente esa cantidad de días la fecha menor.
- Nos diga si después del incremento anterior ambas son iguales o no.


4.- Resuelve las siguientes expresiones, paso a paso. (0,5 puntos)
Ten en cuenta que las variables X, Y y Z son variables enteras con valores X=5, Y=-8 y Z=10:
• X>Y || Z>X && Z==9.
5>-8 || 10>5 && 10==9
True || True && False
True || False
True
• (Y<0 || !Z==10 || !X==9) && 1==1
(-8<0 || !10==10 || !5==9) && 1==1
(True || False || True) && True
True && True
True
