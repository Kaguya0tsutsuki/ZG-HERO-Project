"use strict";
const botaoSalvarEmpresa = document.getElementById("salvar");
botaoSalvarEmpresa === null || botaoSalvarEmpresa === void 0 ? void 0 : botaoSalvarEmpresa.addEventListener("click", criarEmpresa);
const nomeEmpresa = document.getElementById("nome");
const cnpjEmpresa = document.getElementById("cnpj");
const emailEmpresa = document.getElementById("email");
const paisEmpresa = document.getElementById("pais");
const estadoEmpresa = document.getElementById("estado");
const cepEmpresa = document.getElementById("cep");
const descricaoEmpresa = document.getElementById("descricao");
const pythonEmpresa = document.getElementById("python");
const javaEmpresa = document.getElementById("java");
const groovyEmpresa = document.getElementById("groovy");
const cEmpresa = document.getElementById("c");
const jsEmpresa = document.getElementById("js");
const senhaEmpresa = document.getElementById("senha");
const confirmarSenhaEmpresa = document.getElementById("confirmar_senha");
let empresas = [];
function criarEmpresa(ev) {
    ev.preventDefault();
    if (validarNomeEmpresa() === false) {
        return;
    }
    else if (validarCNPJEmpresa() === false) {
        return;
    }
    else if (validarEmailEmpresa() === false) {
        return;
    }
    else if (validarPaisEmpresa() === false) {
        return;
    }
    else if (validarEstadoEmpresa() === false) {
        return;
    }
    else if (validarCEPEmpresa() === false) {
        return;
    }
    else if (validarDescricaoEmpresa() === false) {
        return;
    }
    else if (validarSenhaEmpresa() === false) {
        return;
    }
    let empresa = new Empresa(nomeEmpresa.value, cnpjEmpresa.value, emailEmpresa.value, paisEmpresa.value, estadoEmpresa.value, cepEmpresa.value, descricaoEmpresa.value, [pythonEmpresa.checked, javaEmpresa.checked, groovyEmpresa.checked, cEmpresa.checked,
        jsEmpresa.checked], senhaEmpresa.value);
    empresas.push(empresa);
    alert("Empresa criada com sucesso!");
    console.log(empresas);
    limparDadosEmpresa();
}
function validarNomeEmpresa() {
    let validarNome = new RegExp(/[A-Z????????????????????????????????????????????????????????????????][a-z????????????????????????????????????????????????????????????????]/), testarNome = validarNome.test(nomeEmpresa.value);
    if (nomeEmpresa.value === "") {
        alert("Nome n??o Informado!");
        return false;
    }
    else if (testarNome === false) {
        nomeEmpresa.value = "";
        alert("Nome Inv??lido!");
        return false;
    }
    return true;
}
function validarCNPJEmpresa() {
    let validarCNPJ = new RegExp(/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/), testarCNPJ = validarCNPJ.test(cnpjEmpresa.value);
    if (cnpjEmpresa.value === "") {
        alert("CNPJ n??o Informado!");
        return false;
    }
    else if (testarCNPJ === false) {
        cnpjEmpresa.value = "";
        alert("CNPJ Inv??lido! Utilizar XX.XXX.XXX/0001-XX");
        return false;
    }
    return true;
}
function validarEmailEmpresa() {
    let validarEmail = new RegExp(/[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/), testarEmail = validarEmail.test(emailEmpresa.value);
    if (emailEmpresa.value === "") {
        alert("Email n??o Informado!");
        return false;
    }
    else if (testarEmail === false) {
        emailEmpresa.value = "";
        alert("Email Inv??lido! Utilizar email@example.com");
        return false;
    }
    return true;
}
function validarPaisEmpresa() {
    let validarPais = new RegExp(/[A-Z????????????????????????????????????????????????????????????????][a-z????????????????????????????????????????????????????????????????]/), testarPais = validarPais.test(paisEmpresa.value);
    if (paisEmpresa.value === "") {
        alert("Pa??s n??o Informado!");
        return false;
    }
    else if (testarPais === false) {
        paisEmpresa.value = "";
        alert("Pa??s Inv??lido!");
        return false;
    }
    return true;
}
function validarEstadoEmpresa() {
    let validarEstado = new RegExp(/[A-Z????????????????????????????????????????????????????????????????][a-z????????????????????????????????????????????????????????????????]/), testarEstado = validarEstado.test(estadoEmpresa.value);
    if (estadoEmpresa.value === "") {
        alert("Estado n??o Informado!");
        return false;
    }
    else if (testarEstado === false) {
        estadoEmpresa.value = "";
        alert("Estado Inv??lido!");
        return false;
    }
    return true;
}
function validarCEPEmpresa() {
    let validarCEP = new RegExp(/^[0-9]{5}-[0-9]{3}$/), testarCEP = validarCEP.test(cepEmpresa.value);
    if (cepEmpresa.value === "") {
        alert("CEP n??o Informado!");
        return false;
    }
    else if (testarCEP === false) {
        cepEmpresa.value = "";
        alert("CEP Inv??lido! Utilizar XXXXX-XXX");
        return false;
    }
    return true;
}
function validarDescricaoEmpresa() {
    if (descricaoEmpresa.value === "") {
        alert("Descri????o n??o Informada!");
        return false;
    }
    return true;
}
function validarSenhaEmpresa() {
    let validarSenha = new RegExp(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/), testarSenha = validarSenha.test(senhaEmpresa.value);
    if (senhaEmpresa.value === "") {
        alert("Senha n??o Informada!");
        return false;
    }
    else if (confirmarSenhaEmpresa.value === "") {
        alert("Confirma????o de senha n??o Informada!");
        return false;
    }
    else if (testarSenha === false) {
        senhaEmpresa.value = "";
        alert("Senha Inv??lida!");
        return false;
    }
    if (confirmarSenhaEmpresa.value === "") {
        alert("Confirma????o de senha n??o Informada!");
        return false;
    }
    else if (senhaEmpresa.value != confirmarSenhaEmpresa.value) {
        senhaEmpresa.value = "";
        confirmarSenhaEmpresa.value = "";
        alert("As senhas n??o s??o semelhantes!");
        return false;
    }
    return true;
}
function limparDadosEmpresa() {
    nomeEmpresa.value = "";
    cnpjEmpresa.value = "";
    emailEmpresa.value = "";
    paisEmpresa.value = "";
    estadoEmpresa.value = "";
    cepEmpresa.value = "";
    descricaoEmpresa.value = "";
    pythonEmpresa.checked = false;
    javaEmpresa.checked = false;
    cEmpresa.checked = false;
    groovyEmpresa.checked = false;
    jsEmpresa.checked = false;
    senhaEmpresa.value = "";
    confirmarSenhaEmpresa.value = "";
}
class Empresa {
    constructor(nome, cnpj, email, pais, estado, cep, descricao, competencia, senha) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.competencia = competencia;
        this.senha = senha;
        this.cnpj = cnpj;
        this.pais = pais;
    }
}
