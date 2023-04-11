/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7;

import java.time.LocalDateTime;

/**
 *
 * @author Death
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Producto producto1=new Producto();
        producto1.setNombreProducto("Coca Cola Zero 1.5 Lts");;
        producto1.setCodigoDeBarras("7767677676767");
        producto1.setPrecio(500);
        
        LocalDateTime ahora= LocalDateTime.now();
        System.out.println("tiempo: "+ ahora);
        
        
        producto1.imprimirNombreDelProducto();
        Producto.saludar();
        
    }
    
}
