package compania;

public class Main {
    public static void main(String [] args){
        //Herencia y sobrecarga de metodos
        PersonaJuridica personaJuridica= new PersonaJuridica("Gobal", "Ramon Castilla 301", "620-6549874",
                "20600347891", "Activo");
        personaJuridica.mostrarDatosPersonaJuridica();

        Empleado empleado= new Empleado("Carlos", "Zapata", "19 Feb", "Calle Francisco 169", "987458749",
                "41051225", 25,  'f', "soltero", 200, "ABC123");
        empleado.mostrarDatosEmpleado();

        // Esta parte es sobrescritura del metodo mostrar
        personaJuridica.mostrarDatos();
        PersonaNatural personaNatural = new PersonaNatural();
        personaNatural.mostrarDatos();
        empleado.mostrarDatos();

        // Polimorfismo
        Persona persona [] = new Persona[4];
        persona [0]  = new Persona().datosParaCalcularRenta(100,10);
        persona[1] = new PersonaNatural().datosParaCalcularRentaPersona(500,1, 10);
        persona[2] = new PersonaJuridica().datosParaCalcularRentaPersonaJuridica(1000);
        persona[3] = new Empleado().datosParaCalcularRentaEmpleado(500,400);


        for (Persona datosPersonas: persona){
            System.out.println("Imprimiendo impuestos"+ datosPersonas.impuesto());
        }
    }

}
