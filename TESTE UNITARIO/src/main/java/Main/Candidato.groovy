package Main

@groovy.transform.ToString()
class Candidato extends Pessoa{
    String cpf
    Integer idade
    String[] competencia

    Candidato(String nome,String cpf, Integer idade, String email, String estado, String cep, String descricao, String[] competencia) {
        super(nome, email, estado, cep, descricao)
        this.cpf = cpf
        this.idade = idade
        this.competencia = competencia
    }
}