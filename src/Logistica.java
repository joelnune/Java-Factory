
public class Logistica {
	public static void main(String[] args) {
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); //referenciando a classe caminhao 
		FabricaTransporte fabricaNavio = new FabricaNavio();//referenciando a classe navio 
		
		Transporte caminhao = fabricaCaminhao.criarTransporte();//chamando o metodo para criar um objeto caminhao
		caminhao.entregar();//chamando o metodo entrega
		
		Transporte navio = fabricaNavio.criarTransporte();
		navio.entregar();
	}
}
