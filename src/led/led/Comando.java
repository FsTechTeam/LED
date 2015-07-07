package led.led;


import java.util.Vector;

public abstract class Comando {

  public Led led;

    public Vector  myLed;
    public Vector  myBoton;
    
public abstract void ejecutar();
 public abstract void SetLed(Led led);

}