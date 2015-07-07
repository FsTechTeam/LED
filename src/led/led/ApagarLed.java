
package led.led;

public class ApagarLed extends Comando{

  public void Ejecutar() {
      this.led.apagar();
  }

  @Override
  public void SetLed(Led led) {
      this.led=led;
  }

}