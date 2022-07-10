package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rafael"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val rafael = Pessoa()

    println(rafael.nome)
    println(rafael.cpf)
}