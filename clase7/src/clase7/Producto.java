/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author Death
 */
public class Producto {
    
     String nombreProducto;
    String codigoDeBarras;
    double precio;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void imprimirNombreDelProducto()
    {
        System.out.println(this.nombreProducto);
    }
    
    public static void saludar()
    {
        
        System.out.println("HOLA COMISION 96!!");
    }
    public int sumaPrecios(int numero){
        return 0;
    }
}
