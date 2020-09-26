import java.time.LocalDateTime

internal class Matricula(aluno: Aluno, curso: Curso, val data: Any = LocalDateTime.now()) {
    override fun toString(): String {
        return "Matricula(data=$data)"
    }
}
