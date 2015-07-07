package led.led;


public class EncederLed extends Comando{

  public void Ejecutar() {
      this.led.Encender();
  }

  @Override
  public void SetLed(Led led ) {
      this.led=led;
  }

}