import groovy.transform.ToString

@ToString(includeNames = true, includeSuperProperties = true )
class Empresa extends Pessoa {

    String cnpj
    String pais
    String[] competencia

    Empresa(String nome, String cnpj, String email, String pais, String estado, String cep, String descricao, String[] competencia) {
        super(nome, email, estado, cep, descricao)
        this.cnpj = cnpj
        this.pais = pais
        this.competencia = competencia
    }


    @Override
    public String toString() {
        return nome + "\n" + cnpj + "\n" + email + "\n" + cep + "\n" +
                estado + "\n" + pais + "\n" + descricao + "\n" + competencia + "\n"
    }
}