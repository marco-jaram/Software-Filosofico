package serhumano;

public class MujerB extends Mujer {
String cuerpoString= "Cuerpo con pene";
	@Override
	public void soyHumano() {
		// TODO Auto-generated method stub
		super.soyHumano();
	}

	@Override
	public void comer() {
		System.out.println("Como comida mexicana porque estoy en mexico");
		super.comer();
	}

	@Override
	public void dormir() {
		System.out.println("Duermo como 8hrs en promedio");
		super.dormir();
	}

	@Override
	public void usoVestimenta() {
	System.out.println("Visto como hombre tradicional");
		super.usoVestimenta();
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
