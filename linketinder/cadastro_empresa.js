var botao = document.getElementById("salvar");
botao === null || botao === void 0 ? void 0 : botao.addEventListener("click", criarEmpresa);
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
var empresas = [];
function criarEmpresa(ev) {
    ev.preventDefault();
    empresas.push([nome.value, cnpj.value, email.value, pais.value, estado.value, cep.value, descricao.value,
        python.checked, java.checked, groovy.checked, c.checked, js.checked, senha.value]);
    console.log(empresas.toString());
}
