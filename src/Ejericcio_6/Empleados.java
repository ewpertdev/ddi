package Ejericcio_6;

import java.util.Scanner;

public abstract class Empleados {
     private String id;

    public Empleados(String id, String nombre, String apellidos, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    private String nombre;
     private String apellidos;
     private double salario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {

         String f;
         Scanner a = new Scanner(System.in);

         while(true) {
             System.out.println("ffsfs");
         }

     }
 }