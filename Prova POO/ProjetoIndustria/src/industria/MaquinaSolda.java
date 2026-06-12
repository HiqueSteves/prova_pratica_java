package industria;

public class MaquinaSolda extends Maquina{
	
	private String tipoSolda;

	public String getTipoSolda() {
		return tipoSolda;
	}

	public void setTipoSolda(String tipoSolda) {
		if (tipoSolda != null && !tipoSolda.isBlank()) {
			
			this.tipoSolda = tipoSolda;
		} else {
			System.out.println("Tipo de solda inválida!");
		}
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Tipo de solda: " + tipoSolda);
	}
	
	
	
}
