internal class Curso (val nomeDoCurso: String,
                      val codigoCurso: Int,
                      professorTitular: ProfessorTitular,
                      var quantidadeMaximaAlunos: Int,
                      val listaDeAlunosMatriculados: MutableList<Aluno>) {

    private fun adicionarUmAluno(aluno: Aluno): Boolean {
        if(listaDeAlunosMatriculados.size < quantidadeMaximaAlunos){
            listaDeAlunosMatriculados.add(aluno)
            return true
        } else return false
    }

    private fun excluirAluno(aluno: Aluno){
        listaDeAlunosMatriculados.remove(aluno)
    }
}