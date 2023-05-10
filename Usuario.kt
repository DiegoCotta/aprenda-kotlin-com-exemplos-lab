import java.util.*
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashSet

data class Usuario(
    val nome: String,
    private var conteudosInscritos: LinkedHashSet<ConteudoEducacional> = linkedSetOf(),
    private var conteudosConcluidos: LinkedHashSet<ConteudoEducacional> = linkedSetOf()
) {
    fun inscreverFormacao(formacao: Formacao) {
        conteudosInscritos.addAll(formacao.conteudos)
    }

    fun progredir() {
        val conteudo: Optional<ConteudoEducacional> = conteudosInscritos.stream().findFirst()
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get())
            conteudosInscritos.remove(conteudo.get())
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!")
        }
    }

    fun calcularTotalXp(): Int {
        return conteudosConcluidos.sumOf { it.calcularXp() }
    }


}

