/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.util.Scanner;


public class Piso  {
  private int [] nump;  
  private  Habitacion [] hab;
  
   public Piso (int numHab,int x) {
       
     this.hab  = new Habitacion[numHab];
    for (int i=0; i < numHab; i++){
        this.hab[i]=new Habitacion(x,y,z);       
        System.out.println(hab);
    }
    
     
}
}
