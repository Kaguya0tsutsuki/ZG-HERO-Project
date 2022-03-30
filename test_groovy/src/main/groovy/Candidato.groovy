import groovy.transform.ToString

@ToString(includeSuperProperties = true, includeNames = true)
class Candidato extends Pessoa {
    String cpf
    String idade
    String[] competencia

    Candidato(String nome, String cpf, String idade, String email, String estado, String cep, String descricao, String[] competencia) {
        super(nome, email, estado, cep, descricao)
        this.cpf = cpf
        this.idade = idade
        this.competencia = competencia
    }

    @Override
    public String toString() {
        return nome + "\n" + cpf + "\n" + idade + "\n" + email + "\n" +
                cep + "\n" + estado + "\n" + descricao + "\n" + competencia + "\n"
    }
}