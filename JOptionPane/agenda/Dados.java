package agenda;

public abstract class Dados {
	
	protected String dia;
	protected String email;
	protected String nome;
	protected String desc;
	protected String horario;
	protected String telefone;

	Dados(String dia ,String email ,String nome , String desc, String horario, String telefone) {
		this.dia = dia;
		this.desc = desc;
		this.horario = horario;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void ExibirA() {
	}
	public void ExibirC() {
	}
	public void ExibirP() {
	}
	public void ExibirPE() {
	}
		

}
