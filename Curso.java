public class Curso {

	private String codigo;
    private String nome;
    private int horas;

    public Curso() {
    }

    public Curso(String codigo, String nome, int horas) {
        this.codigo = codigo;
        this.nome = nome;
        this.horas = horas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

	@Override
	public String toString() {
		return "\nCodigo: " + codigo + "\nNome: " + nome + "\nHoras: " + horas;
	}
	
}
