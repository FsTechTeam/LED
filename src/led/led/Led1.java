package led.led;


public class Led1 implements Led {

 
  @Override
  public void Encender() {
      System.out.println("led1 encendido");
  }

  @Override
  public void apagar() {
      System.out.println("led1 apagado");
  }

}