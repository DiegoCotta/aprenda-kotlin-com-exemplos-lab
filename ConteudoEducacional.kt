data class ConteudoEducacional(var nome: String, val descricao: String, val nivel: Nivel, val duracao: Int = 60) {
    fun calcularXp(): Int {
        return nivel.xp * duracao
    }
}