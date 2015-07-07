package led.led;

import java.util.List;
import java.util.Vector;

public class Boton {

  public List<Comando> comandos;
    

  public void Presionar() {
      
      for (Comando comando : comandos) {
          comando.ejecutar();
      }
      
  }

  public void addComando(Comando comando) {
      this.comandos.add(comando);
  }

}