internal class DigitalHouseManager {

    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfesores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    private fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        val newCurso = Curso()
        newCurso.nomeDoCurso = nome
        newCurso.codigoCurso = codigoCurso
        newCurso.quantidadeMaximaAlunos = quantidadeMaximaDeAlunos
        listaDeCursos.add(newCurso)
    }

    private fun excluirCurso(codigoCurso: Int) {
        listaDeCursos.forEach {
            if(codigoCurso == it.codigoCurso) listaDeCursos.removeAt(codigoCurso)
        }
    }

    private fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val newProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras )
        listaDeProfesores.add(newProfessorAdjunto)
    }

    private fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val newProfessorTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaDeProfesores.add(newProfessorTitular)
    }

    private fun excluirProfessor(codigoProfessor: Int){
        listaDeProfesores.forEach {
            if(codigoProfessor == it.codigoProfessor) listaDeProfesores.removeAt(codigoProfessor)
        }
    }
}