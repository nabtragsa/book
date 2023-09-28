package mn2a;
public class ejercicio {
public static void main (String[] args) {
   BasicConfigurator.configure();
   log.debug("esto es un logger de debugging");
   log.info("esto es un logger de debugging");
   /* Logger requiere actualmente BasicConfigurator.configure() */

}
}