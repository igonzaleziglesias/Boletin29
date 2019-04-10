
package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Factura {
    ArrayList<Barco> aluguer= new ArrayList<Barco>();
    
    public void añadir(Barco barco){
        this.aluguer.add(barco);
    }
    
    public void mostrarFactura(){
       int matricula=Integer.parseInt(JOptionPane.showInputDialog("Indicar matricula: "));
       for (Barco ele:aluguer){
           if (ele.getMatricula()==matricula){
               JOptionPane.showMessageDialog(null, "Matricula: "+ele.getMatricula()+"\nEslora: "+ele.getEslora()+"\nPrecio aluguer: "+ele.calcularPrecio());
           }
       } 
    }
}
