
package led.led;

public class ApagarLed extends Comando{

  @Override
  public void ejecutar() {
      this.led.apagar();
  }

  @Override
  public void SetLed(Led led) {
      this.led=led;
  }

}