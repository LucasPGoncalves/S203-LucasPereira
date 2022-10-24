package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artigo {
	
	private String estado;
	private List<String> logHistorico = new ArrayList<>();
	
	public Artigo() {
		this.estado = "Rascunho";
	}
	
	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstace();
		if("Rascunho".equals(this.estado)) {
			if(seguranca.ehUsuarioAutor) {
				this.estado = "Revisando";
				this.logHistorico.add("Transitado para Revisando em" + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario nao tem permissao para publicar");
			}
		}
		if("Revisando".equals(this.estado)) {
			if(seguraca.ehUsuarioModerador) {
				this.estado = "Aprovado";
				this.logHistorico.add("Transitado para Aprovado em " + LocalDate.now());
			} else {
				throw new RuntimeException("Usuario nao tem permissao para publicar");
			}
		}
	}
}
