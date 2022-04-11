var botaoSalvar = document.getElementById("salvar");
botaoSalvar === null || botaoSalvar === void 0 ? void 0 : botaoSalvar.addEventListener("click", criarEmpresa);
var nome = document.getElementById("nome");
var cnpj = document.getElementById("cnpj");
var email = document.getElementById("email");
var pais = document.getElementById("pais");
var estado = document.getElementById("estado");
var cep = document.getElementById("cep");
var descricao = document.getElementById("descricao");
var python = document.getElementById("python");
var java = document.getElementById("java");
var groovy = document.getElementById("groovy");
var c = document.getElementById("c");
var js = document.getElementById("js");
var senha = document.getElementById("senha");
var confirmarSenha = document.getElementById("confirmar_senha");
var empresas = [];
function criarEmpresa(ev) {
    ev.preventDefault();
    var validaNome = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/), testNome = validaNome.test(nome.value);
    if (nome.value === "") {
        nome.value = "";
        alert("Nome não Informado!");
        return;
    }
    else if (testNome === false) {
        nome.value = "";
        alert("Nome Inválido!");
        return;
    }
    var validaCNPJ = new RegExp(/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/), testCNPJ = validaCNPJ.test(cnpj.value);
    if (cnpj.value === "") {
        cnpj.value = "";
        alert("CNPJ não Informado!");
        return;
    }
    else if (testCNPJ === false) {
        cnpj.value = "";
        alert("CNPJ Inválido! Utilizar XX.XXX.XXX/0001-XX");
        return;
    }
    var validaEmail = new RegExp(/[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/), testEmail = validaEmail.test(email.value);
    if (email.value === "") {
        email.value = "";
        alert("Email não Informado!");
        return;
    }
    else if (testEmail === false) {
        email.value = "";
        alert("Email Inválido! Utilizar email@example.com");
        return;
    }
    var validaPais = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/), testPais = validaPais.test(pais.value);
    if (pais.value === "") {
        pais.value = "";
        alert("País não Informado!");
        return;
    }
    else if (testPais === false) {
        pais.value = "";
        alert("País Inválido!");
        return;
    }
    var validaEstado = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/), testEstado = validaEstado.test(estado.value);
    if (estado.value === "") {
        estado.value = "";
        alert("Estado não Informado!");
        return;
    }
    else if (testEstado === false) {
        estado.value = "";
        alert("Estado Inválido!");
        return;
    }
    var validaCEP = new RegExp(/^[0-9]{5}-[0-9]{3}$/), testCEP = validaCEP.test(cep.value);
    if (cep.value === "") {
        cep.value = "";
        alert("CEP não Informado!");
        return;
    }
    else if (testCEP === false) {
        cep.value = "";
        alert("CEP Inválido! Utilizar XXXXX-XXX");
        return;
    }
    if (descricao.value === "") {
        descricao.value = "";
        alert("Descrição não Informada!");
        return;
    }
    var validaSenha = new RegExp(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/), testSenha = validaSenha.test(senha.value);
    if (senha.value === "") {
        senha.value = "";
        alert("Senha não Informada!");
        return;
    }
    else if (confirmarSenha.value === "") {
        alert("Confirmação de senha não Informada!");
        return;
    }
    else if (testSenha === false) {
        senha.value = "";
        alert("Senha Inválida!");
        return;
    }
    if (confirmarSenha.value === "") {
        confirmarSenha.value = "";
        alert("Confirmação de senha não Informada!");
        return;
    }
    else if (senha.value != confirmarSenha.value) {
        senha.value = "";
        confirmarSenha.value = "";
        alert("As senhas não são semelhantes!");
        return;
    }
    empresas.push([nome.value, cnpj.value, email.value, pais.value, estado.value, cep.value, descricao.value,
        python.checked, java.checked, groovy.checked, c.checked, js.checked, senha.value]);
    console.log(empresas.toString());
}
