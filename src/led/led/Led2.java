package led.led;


public class Led2 implements Led {

  @Override
  public void Encender() {
      System.out.println("led2 encendido");
  }

  @Override
  public void apagar() {
      System.out.println("led2 apagado");
  }

}