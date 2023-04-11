	
public class FabricaCaminhao implements FabricaTransporte{ //implementa a interface fabrica transporte

	@Override
	public Transporte criarTransporte() { 
		return new Caminhao(); //implementa o metodo fabrica transporte e retorna uma instancia do tipo caminhao
	}

}
