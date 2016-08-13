/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cristian beras
 */
public class Vehiculo {
    
   private String marcas;
   private String color;
   private String modelo;
   private String matricula;
   private int    anio;

    public Vehiculo(String marcas, String color, String modelo, String matricula, int anio) {
        this.marcas = marcas;
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
   
   
    //metodos

    public void arrancarVehiculo(){
        System.out.println("El vehiculo arranco");
    
    }
   
    
}
