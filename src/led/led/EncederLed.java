package led.led;


public class EncederLed extends Comando{

  @Override
  public void ejecutar() {
      this.led.Encender();
  }

  @Override
  public void SetLed(Led led ) {
      this.led=led;
  }

}