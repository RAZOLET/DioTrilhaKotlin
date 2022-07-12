package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val rafael = Pessoa(nome = "Rafael", cpf = "123456789-10")
    println(rafael.nome)
    println(rafael.cpf)

    val jonh = Funcionario( "Jonh", "987654321-00", BigDecimal.valueOf(2000.0))
    println(jonh.nome)
    println(jonh.cpf)
    println(jonh.salario)
}
