const botao = document.getElementById("salvar");
botao?.addEventListener("click", criarCandidato);

const nome = document.getElementById("nome") as HTMLInputElement;
const cpf = document.getElementById("cpf") as HTMLInputElement;
const idade = document.getElementById("idade") as HTMLInputElement;
const email = document.getElementById("email") as HTMLInputElement;
const estado = document.getElementById("estado") as HTMLInputElement;
const cep = document.getElementById("cep") as HTMLInputElement;
const descricao = document.getElementById("descricao") as HTMLInputElement;

const python = document.getElementById("python") as HTMLInputElement;
const java = document.getElementById("java") as HTMLInputElement;
const groovy = document.getElementById("groovy") as HTMLInputElement;
const c = document.getElementById("c") as HTMLInputElement;
const js = document.getElementById("js") as HTMLInputElement;

const senha = document.getElementById("senha") as HTMLInputElement;

let candidatos = [];

function criarCandidato(this: HTMLElement, ev: Event) {
  ev.preventDefault();

  candidatos.push([nome.value, cpf.value, idade.value, email.value, estado.value, cep.value, descricao.value,
    python.checked, java.checked, groovy.checked, c.checked, js.checked, senha.value]);

  console.log(candidatos.toString())

}