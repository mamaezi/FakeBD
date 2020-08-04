
public class BancoOracle implements InterfaceBD {
	
	@Override
	public void conectar() {
		System.out.println("conectando");
	}
	
	@Override 
	public void executar(String comando) {
		System.out.println(comando);
	}
	
	@Override
	public void desconectar() {
		System.out.println("desconectando");
	}

}
