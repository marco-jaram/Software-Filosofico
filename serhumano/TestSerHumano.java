package serhumano;

public class TestSerHumano {

    public static void main(String[] args) {
	Mujer mujera = new MujerA();
	mujera.comer();
	mujera.usoVestimenta();
	mujera.soyHumano();

	Mujer mujerb = new MujerB();
	mujerb.comer();

    }

}
