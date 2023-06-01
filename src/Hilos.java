public class Hilos extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("Este mensaje es de Hilos que hereda de Thread en 4 segundos Desde que se inicia el programa");

            Thread.sleep(2000);
            System.out.println("Este mensaje es de Hilos que hereda de Thread en 2 segundos Despues del primer sout de Hilos");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
