
public class FabricaNavio implements FabricaTransporte{

	@Override
	public Transporte criarTransporte() {
		return new Navio();//criar uma instancia do transporte Navio
	}

}
