//Mariana Gonçalves Gulden Gravatá - 1910109

public class Principal {

	public static void main(String[] args) {
		
		Curso CienciaDaComputacao = new Curso("123456", "C. da Computação", 3000);

        Disciplina tecnicaDeProgramacao = new Disciplina("1324", "Técnica de programação", CienciaDaComputacao, 4);

        Turma turma = new Turma("12345", 3, tecnicaDeProgramacao);

        Aluno Mariana = new Aluno("1910109", "Mariana", "mariana@email.com", CienciaDaComputacao);
        Aluno Jenyelle = new Aluno("1920008", "Jenyelle", "jenyelle@email.com", CienciaDaComputacao);

        Aluno Joao = new Monitor("1984657", "Joao", "joao@email.com", CienciaDaComputacao, tecnicaDeProgramacao);
        Aluno Maria = new Monitor("1315579", "Maria", "maria@email.com", CienciaDaComputacao, tecnicaDeProgramacao);

        Aluno.setMensalidade(1000);
        Monitor.setDesconto(0.3);

        turma.addAluno(Mariana);
        turma.addAluno(Jenyelle);
        turma.addAluno(Joao);
        turma.addAluno(Maria);

        System.out.println("A média das matrículas dá: R$" + turma.Media());
        System.out.println(turma.getAluno(0));
                       
	}

}
