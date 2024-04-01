import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       // Insertar una fecha
        LocalDate fechaCumple=LocalDate.of(2024,05,04);
//        Fecha actual
        LocalDate fechahoy=LocalDate.now();
        //Agregar 4 dias a la fecha de hoy
        LocalDate fechaMas4=fechahoy.plus(4,ChronoUnit.DAYS);
        System.out.println(fechaMas4);
        //Restarle 4 dias a la fecha de hoy
        LocalDate fechaMenos5=fechahoy.minus(5,ChronoUnit.DAYS);
        System.out.println(fechaMenos5);
        /******** Otra forma de hacer la suma o resta de valores ********/
        //Tambien se puede utilizar plusDays..plusMonths..plusYears /minusDays,minusMonths,minusYears
        fechaMenos5=fechahoy.minusDays(5);
        System.out.println(fechaMenos5);
        //De una fecha podemos tomar un dato, por ejemplo, solo el dia, o solo el año, o solo el mes
        System.out.println("El dia de hoy es "+ fechahoy.getDayOfWeek()); //Monday....
        System.out.println("El dia de hoy es "+ fechahoy.getDayOfMonth()); //la fecha de hoy (numeros)
        System.out.println("El dia de hoy es "+ fechahoy.getDayOfYear()); // indica el numero del dia en el año en curso
        //Para el mes y para el año..
        LocalDate fechaNacimiento=LocalDate.of(1975,9,6);
        System.out.println("Florin tiene " + (LocalDate.now().getYear()-fechaNacimiento.getYear()));

        //Como saber si el año es bisiesto
        boolean bisiesto=fechahoy.isLeapYear();
        System.out.println("Este año es Bisiesto->" + bisiesto);

        //Comparar dos fechas ->boolean
        boolean despues=fechaNacimiento.isAfter(fechahoy); //false
        System.out.println("La fecha de nacimiento de Florin es DESPUES que la de hoy->" + despues);
        boolean antes=fechaNacimiento.isBefore(fechahoy); //false
        System.out.println("La fecha de nacimiento de Florin es ANTES que la de hoy->" + antes);

        //Si necesitamos saber el perido de tiempo que ha pasado entre dos fechas->until
        //El resultado no es de tipo LocalDate sino de tipo Period
        Period periodoF=fechahoy.until(fechaNacimiento);
        System.out.println("Tiempo que ha pasado desde que Florin nacio ->"+periodoF.getDays() + " dias");
        System.out.println("Tiempo que ha pasado desde que Florin nacio ->"+periodoF.getMonths() + " meses");
        System.out.println("Tiempo que ha pasado desde que Florin nacio ->"+periodoF.getYears() + " años");

        //Mostrar fecha en formato español
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy"); //definir el formato

        System.out.println("La fecha en formato Español es " + fechaNacimiento.format(formato));

        //Otra forma de dar formato
        DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato2));
        DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato3));
        DateTimeFormatter formato4=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato4));
        DateTimeFormatter formato5=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato5).toUpperCase());

    /**HORAS**/
        LocalTime horaA=LocalTime.now();
        System.out.println("La hora actual es ->" + horaA);
        int hora=horaA.getHour();
        int minutos=horaA.getMinute();
        int segundos=horaA.getSecond();
        //Los mismos métodos..ejemplo, sumarle 5 horas a la hora actual ** minus o plus
        LocalTime horaMas5=horaA.plus(5,ChronoUnit.HOURS);
        System.out.println("Dentro de cinco horas seran las "+horaMas5);

        //Calcular el periodo de tiempo entre dos horas
        //Duration -> se utiliza para calcular la duracion entre dos horas

        Duration duracion=Duration.between(LocalTime.of(22,50,15),horaA);
        System.out.println("Duracion entre las dos horas->" + duracion);
       DateTimeFormatter formato6=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("La hora actual formateada ->" + horaA.format(formato6));



















    }


}
