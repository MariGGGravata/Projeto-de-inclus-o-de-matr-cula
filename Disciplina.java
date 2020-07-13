public class Disciplina {

	private String codigo;
    private String nome;
    private Curso curso; 
    private int creditos;

    public Disciplina() {
    }

    public Disciplina(String codigo, String nome, Curso curso, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.creditos = creditos;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
	
}
