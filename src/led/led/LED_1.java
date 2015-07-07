/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package led.led;

/**
 *
 * @author Geek
 */
public class LED_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Ejemplo de utilizacion desde el cliente*/
        /*instanciando un nuevo control*/
        Control control= new Control();
        /*instancias de contenedores (receivers)*/
        Led1  l1= new Led1();
        Led2  l2= new Led2();
        Led3  l3= new Led3();
        /*instanciando dos botones*/
        Boton boton= new Boton();
        Boton boton2= new Boton();
        /*instanciando comandos para el boton*/
        ApagarLed apagar1= new ApagarLed();
        EncederLed encender2= new EncederLed();
        EncederLed encender3= new EncederLed();
        /*programando el primer boton*/
        apagar1.SetLed(l1);
        boton.addComando(apagar1);
        encender2.SetLed(l2);
        boton.addComando(encender2);
        encender3.SetLed(l3);
        boton.addComando(encender3);
        /*agregando boton1 al control*/
        control.addBoton(boton);
        /*comandos boton2*/
        ApagarLed apagarl1= new ApagarLed();
        EncederLed encenderl2= new EncederLed();
        ApagarLed apagarl3= new ApagarLed();
        /*programando boton 2*/
        apagarl1.SetLed(l1);
        boton2.addComando(apagarl1);
        encenderl2.SetLed(l2);
        boton2.addComando(encenderl2);
        apagarl3.SetLed(l3);
        boton2.addComando(apagarl3);
        /*agregando boton2 al control*/
        control.addBoton(boton2);
        /*ejecutando botones*/
        
        control.botones.get(0).Presionar();
        System.out.println("boton 1 ejecutado");
        control.botones.get(1).Presionar(); 
        System.out.println("boton 2 ejecutado");
    }
    
}
