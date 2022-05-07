import { Pessoa } from "../pessoa/pessoa"

export class Candidato extends Pessoa{
    cpf: string
    idade: string
  
    constructor(nome: string, cpf: string, idade: string, email: string, estado: string, cep: string, descricao: string, competencia: any[], senha: string){
        super(nome, email, estado, cep, descricao, competencia, senha)
        this.cpf = cpf
        this.idade = idade

    }
}