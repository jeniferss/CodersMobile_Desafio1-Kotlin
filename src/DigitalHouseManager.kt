import java.time.LocalDateTime

class DigitalHouseManager {

    var listaDeAlunos: ArrayList<Aluno> = arrayListOf()
    var listaDeProfesores: ArrayList<Professor> = arrayListOf()
    var listaDeCursos: ArrayList<Curso> = arrayListOf()
    var listaDeMatriculas: ArrayList<Matricula> = arrayListOf()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        val newCurso = Curso()
        newCurso.nomeDoCurso = nome
        newCurso.codigoCurso = codigoCurso
        newCurso.quantidadeMaximaAlunos = quantidadeMaximaDeAlunos
        listaDeCursos.add(newCurso)
    }

    fun excluirCurso(codigoCurso: Int) {
        for(curso in listaDeCursos){
            if(codigoCurso == curso.codigoCurso){
                listaDeCursos.remove(curso)
                break
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val newProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras )
        listaDeProfesores.add(newProfessorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val newProfessorTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaDeProfesores.add(newProfessorTitular)
    }

   fun excluirProfessor(codigoProfessor: Int){
       for(professor in listaDeProfesores){
           if(codigoProfessor == professor.codigoProfessor){
               listaDeProfesores.remove(professor)
               break
           }
       }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val newAluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(newAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        for(curso in listaDeCursos){
            if(codigoCurso == curso.codigoCurso){
                for(aluno in listaDeAlunos){
                    if(codigoAluno == aluno.codigoAluno){
                        if (curso.adicionarUmAluno(aluno)) {
                            val newMatricula = Matricula(aluno, curso, LocalDateTime.now())
                            listaDeMatriculas.add(newMatricula)
                            println("Matrícula Realizada Com Sucesso")
                            break
                        } else println("A matrícula não pôde ser realizada. Não há vagas disponiveis")
                    }
                }
                break
            }
        }
    }

   fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
       listaDeCursos.forEach { itC ->
           if (codigoCurso == itC.codigoCurso) {
               for (professor in listaDeProfesores) {
                   if (codigoProfessorAdjunto == professor.codigoProfessor) itC.professorAdjunto = professor as ProfessorAdjunto
                   if (codigoProfessorTitular == professor.codigoProfessor) itC.professorTitular = professor as ProfessorTitular
               }
           }
       }
   }


    /*
    fun testarExcluirAluno(codigoCurso: Int) {
        for(curso in listaDeCursos){
            if(codigoCurso == curso.codigoCurso){
                curso.excluirAluno(curso.listaDeAlunosMatriculados[0])
                break
            }
        }
    }
     */
}