<h1>LocalTime y LocalDateTime</h1>
<p>Para gestionar las fechas, usaremos la clase LocalDate; para la hora, LocalTime y para la
combinación de fecha y hora, LocalDateTime. Las tres clases tienen implementado el método
toString(), aunque éste los muestra con formato anglosajón. Para representar fechas y/u horas
formateadas a nuestro gusto, usaremos la clase DateTimeFormatter.
</p>
<h2>Fechas</h2>
Podemos crear un objeto Localdate de varias formas. Por ejemplo, el 12 de marzo de 2021, sería, 
LocalDate d1 = LocalDate.of(2021, 3, 12);
o bien,
LocalDate d1 = LocalDate.parse("2021-03-12");
Si queremos crear la fecha actual en el contexto (país, zona horaria, etc.) de la máquina que ejecute el programa escribiremos,
LocalDate d2 = LocalDate.now();
<p>
Para incrementar d1 en cuatro días,
LocalDate d3 = d1.plus(4, ChronoUnit.DAYS);
De forma análoga se puede incrementar en un número de semanas, meses o años. O bien, para decrementar, disponemos de minus().</p>

<p>Los métodos de las API de fechas y horas devuelven objetos inmutables y nunca null para que puedan ser encadenados de forma segura. Así el valor devuelto por un método se puede usar como
parámetro de entrada del siguiente sin tener que introducir una variable intermedia. Por ejemplo,</p>

LocalDate d4 = LocalDate.now().minus(2, ChronoUnit.DAYS);
asigna a d4 la fecha de anteayer.
<h2>Horas</h2>
<p>Para las horas (sin fecha) usaremos la clase LocalTime. Si queremos crear un objeto LocalTime con la hora 14:32,
LocalTime t1 = LocalTime.of(14, 32);
o bien,
LocalTime t1 = LocalTime.parse("14:32");
Con segundos,
LocalTime t2 = LocalTime. of(14, 32, 15);
La hora actual a partir del reloj del sistema,
LocalTime t3 = LocalTime.now();
System.out.println(t3);
Obtendríamos por pantalla algo así como,
11:14:51.302300900
donde la parte decimal de los segundos son nanosegundos.
A partir de un LocalTime, se pueden obtener los distintos campos con getHour(), getMinute() o getSecond(),
int minuto=t1.getMinute();// 32
Podemos incrementar un LocalTime con plus(). Para añadir 35 minutos,
LocalTime t4 = t1.plus(35, ChronoUnit.MINUTES);// las 15:07
O decrementar con minus(),
LocalTime t5 = t1.minus(5, ChronoUnit.HOURS);// las 9:32
</p>
