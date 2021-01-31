package OrientadoObjeto.Composição.MxM;

import java.util.ArrayList;

public class Aluno {
	String nome = "";
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}
