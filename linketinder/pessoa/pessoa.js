"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Pessoa = void 0;
class Pessoa {
    constructor(nome, email, estado, cep, descricao, competencia, senha) {
        this.competencia = competencia;
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.senha = senha;
    }
}
exports.Pessoa = Pessoa;
