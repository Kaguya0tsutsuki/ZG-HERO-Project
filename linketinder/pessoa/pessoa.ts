export class Pessoa{

    nome: string
    email: string
    estado: string
    cep: string
    descricao: string
    competencia: any[]
    senha: string
  
    constructor(nome: string, email: string, estado: string, cep: string, descricao: string, competencia: any[], senha: string) {
        this.competencia = competencia
        this.nome = nome
        this.email = email
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.senha = senha
    }
  
}