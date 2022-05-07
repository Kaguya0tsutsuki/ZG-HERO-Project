import { Pessoa } from "../pessoa/pessoa"

export class Empresa extends Pessoa{
    cnpj: string
    pais: string

    constructor(nome: string, cnpj: string, email: string, pais: string, estado: string, cep: string, descricao: string, competencia: any[], senha: string) {
        super(nome, email, estado, cep, descricao, competencia, senha)
        this.cnpj = cnpj
        this.pais = pais
    }
  
}