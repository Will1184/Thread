public class Ejecutable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Este mensaje es de Hilos que implementa de Runnable 2 segundos Desde que se inicia el programa");
            Thread.sleep(4000);
            System.out.println("Este mensaje es de Hilos que implementa de Runnable en 4 segundos Desde el primer sout de Ejecutable");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
