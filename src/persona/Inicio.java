package persona;

public class Inicio {
    public void recibir() {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();
        Persona[] listaPersonas = new Persona[5];
//crear metodo de relleno de arreglo de personas
        persona1.setNombre("Aquiles1");
        persona1.setEdad(17);
        persona1.setPeso(70);
        persona1.setAltura(1.5);

        persona2.setNombre("Aquiles2");
        persona2.setEdad(28);
        persona2.setPeso(70);
        persona2.setAltura(1.6);

        persona3.setNombre("Aquiles3");
        persona3.setEdad(38);
        persona3.setPeso(70);
        persona3.setAltura(1.7);

        persona4.setNombre("Aquiles4");
        persona4.setEdad(48);
        persona4.setPeso(70);
        persona4.setAltura(1.8);

        persona5.setNombre("Aquiles5");
        persona5.setEdad(58);
        persona5.setPeso(70);
        persona5.setAltura(2.0);

        listaPersonas[0] = persona1;
        listaPersonas[1] = persona2;
        listaPersonas[2] = persona3;
        listaPersonas[3] = persona4;
        listaPersonas[4] = persona5;

        imc(listaPersonas);
    }
//reconsiderar nombre de este metodo
    private void imc(Persona[] listaPersonas) {
        double imc;

        for (Persona persona : listaPersonas) {
            //metodo del imc como tal
            imc = persona.getPeso() /( persona.getAltura()*persona.getAltura() );
            if (imc < 18.5) {
                System.out.println("Su IMC indica que usted esta bajo de peso : " + persona.getNombre() + " IMC: " + imc);
            }
            if (imc > 18.5 && imc < 24.9) {
                System.out.println("Su IMC indica que usted esta normal de peso: "+ persona.getNombre() + " IMC: " + imc);
            }
            if (imc > 25.0 && imc < 29.9) {
                System.out.println("Su IMC indica que usted esta Sobrepeso : "+ persona.getNombre() + " IMC: " + imc);
            }
            if (imc > 30.0) {
                System.out.println("Su IMC indica que usted tiene Obesidad : "+ persona.getNombre() + " IMC: "  + imc);
            }
            //metodo aparte
            if (persona.getEdad() > 17) {
                System.out.println("Mayor de edad");
            }else {
                System.out.println("Menor de edad");
            }
            System.out.println( persona.toString());
            System.out.println(" ");
        }
    }
}
