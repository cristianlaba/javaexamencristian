package com.company;

public class EmpleadoQA extends Empleado{

    private double comicion;

    public double getComicion() {
        return comicion;
    }

    public void setComicion(double comicion) {
        this.comicion = comicion;
    }

    public EmpleadoQA(String nombre, String apellido, int edad, double salario, double comicion) {
        super(nombre, apellido, edad, salario, comicion);
    }

    // Es el toString de salario y se agrego super.toString para reutilizar lo de empleado


    @Override
    public String toString() {
        return super.toString() + "EmpleadoQA{" +
                "comicion=" + comicion +
                '}';
    }

    @Override
    public boolean plus() {

        if(super.getEdad()>30 && this.comicion>200){
            double nuevoSalario = super.setSalario(super.getSalario() + super.PLUS);
            super.setSalario(nuevoSalario);
            System.out.println("Se le ha añadido un plus" + super.getNombre());
            return true;
        }
        return false;
    }

}



