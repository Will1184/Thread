public class Main {
    public static void main(String[] args) {
        //Clase Hilos que es hija de Thread
        Hilos hilos= new Hilos();
        hilos.start();

        //Clase ejecutable que implementa de    Runnable
        Ejecutable ejecutable = new Ejecutable();
        //Para usar el ejecutable y se visualice en la
        // consola usamos un objeto de tipo thread lo inicializamos
        Thread thread = new Thread(ejecutable);
        thread.start();
    }
}
