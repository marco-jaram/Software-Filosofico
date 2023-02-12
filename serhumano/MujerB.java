package serhumano;

public class MujerB extends Mujer {
    String cuerpoString= "Cuerpo con pene";
    @Override
    public void soyHumano() {

	super.soyHumano();
    }

    @Override
    public void comer() {
	System.out.println("Soy mujer B y como comida china y estoy en Mexico");
	super.comer();
    }

    @Override
    public void dormir() {
	System.out.println("Soy mujer B y duermo como 8hrs en promedio");
	super.dormir();
    }

    @Override
    public void usoVestimenta() {
	System.out.println("Soy mujer B y visto como hombre tradicional");
	super.usoVestimenta();
    }
    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
    }
}
