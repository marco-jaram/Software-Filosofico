package serhumano;

public class MujerA extends Mujer{
    String cuerpomujera;


    @Override
    public void soyHumano() {
	super.soyHumano();
	System.out.println("Soy ser humano con vagina jiji desde mujer A");

    }

    @Override
    public void comer() {
	System.out.println("Soy mujer A y como comida japonesa porque estoy en japon");
    }

    @Override
    public void dormir() {
	System.out.println("Soy mujer A duremo 6 hrs diarias en promedio");
    }

    @Override
    public void usoVestimenta() {
	System.out.println("Soy mujer A y me visto femenina");
    }



}
