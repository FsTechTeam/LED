package led.led;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Control {

  public List<Boton> botones;

    public Vector  myBoton;
    public Vector  myAplicacion;

    public Control() {
        botones= new ArrayList<>();
    }
    

  public void addBoton(Boton boton) {
      botones.add(boton);
  }

}