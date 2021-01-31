package OrientadoObjeto.Composição.MxM;

public class Teste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana");
		Aluno a2 = new Aluno("João");
		Aluno a3 = new Aluno("Marcos");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Android");
		Curso c3 = new Curso("Frances");
		
		c1.adicionarAluno(a2);
		c1.adicionarAluno(a3);
		
		c2.adicionarAluno(a1);
		c3.adicionarAluno(a3);
		
		a1.adicionarCurso(c3);
		a2.adicionarCurso(c1);
		a3.adicionarCurso(c2);
		
		for(Aluno aluno : c1.alunos) {
			System.out.println("Curso 1: "+aluno);
		}
	}
}
