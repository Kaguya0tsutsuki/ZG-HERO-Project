@groovy.transform.ToString()
class Pessoa {
    String nome
    String email
    String estado
    String cep
    String descricao

    public Pessoa(String nome, String email, String estado, String cep, String descricao){
        this.nome = nome
        this.email = email
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
    }
}
