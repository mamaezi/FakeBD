
public class AppQueAcessaBanco {

	public static void main(String args[]) {
		InterfaceBD ibd;
		
		ibd= new BancoOracle();
		
		ibd.conectar();
		ibd.executar("select * from tabela");
		ibd.desconectar();

	}
}
