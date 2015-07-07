package led.led;

public class Led3 implements Led {

  @Override
  public void Encender() {
      System.out.println("led3 encendido");
  }

  @Override
  public void apagar() {
      System.out.println("led3 apagado");
  }

}