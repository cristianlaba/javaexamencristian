package com.company;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public final double PLUS = 1000;

    // Se crearon los get y set de nombre y apellido

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        this.salario = salario;
        return salario;
    }


    public Empleado(String nombre, String apellido, int edad, double salario, double comicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public abstract boolean plus();

    // Se creo el toString de nombre y apellido


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", PLUS=" + PLUS +

                '}';
    }
}