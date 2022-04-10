var botao = document.getElementById("salvar");
botao === null || botao === void 0 ? void 0 : botao.addEventListener("click", criarCandidato);
var nome = document.getElementById("nome");
var cpf = document.getElementById("cpf");
var idade = document.getElementById("idade");
var email = document.getElementById("email");
var estado = document.getElementById("estado");
var cep = document.getElementById("cep");
var descricao = document.getElementById("descricao");
var python = document.getElementById("python");
var java = document.getElementById("java");
var groovy = document.getElementById("groovy");
var c = document.getElementById("c");
var js = document.getElementById("js");
var senha = document.getElementById("senha");
var candidatos = [];
function criarCandidato(ev) {
    ev.preventDefault();
    candidatos.push([nome.value, cpf.value, idade.value, email.value, estado.value, cep.value, descricao.value,
        python.checked, java.checked, groovy.checked, c.checked, js.checked, senha.value]);
    console.log(candidatos.toString());
}
