"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Candidato = void 0;
const pessoa_1 = require("../pessoa/pessoa");
class Candidato extends pessoa_1.Pessoa {
    constructor(nome, cpf, idade, email, estado, cep, descricao, competencia, senha) {
        super(nome, email, estado, cep, descricao, competencia, senha);
        this.cpf = cpf;
        this.idade = idade;
    }
}
exports.Candidato = Candidato;
