"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Empresa = void 0;
const pessoa_1 = require("../pessoa/pessoa");
class Empresa extends pessoa_1.Pessoa {
    constructor(nome, cnpj, email, pais, estado, cep, descricao, competencia, senha) {
        super(nome, email, estado, cep, descricao, competencia, senha);
        this.cnpj = cnpj;
        this.pais = pais;
    }
}
exports.Empresa = Empresa;
