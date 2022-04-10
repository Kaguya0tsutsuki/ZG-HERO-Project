const botao = document.getElementById("salvar");
botao?.addEventListener("click", criarEmpresa);

const nome = document.getElementById("nome") as HTMLInputElement;
const cnpj = document.getElementById("cnpj") as HTMLInputElement;
const email = document.getElementById("email") as HTMLInputElement;
const pais = document.getElementById("pais") as HTMLInputElement;
const estado = document.getElementById("estado") as HTMLInputElement;
const cep = document.getElementById("cep") as HTMLInputElement;
const descricao = document.getElementById("descricao") as HTMLInputElement;

const python = document.getElementById("python") as HTMLInputElement;
const java = document.getElementById("java") as HTMLInputElement;
const groovy = document.getElementById("groovy") as HTMLInputElement;
const c = document.getElementById("c") as HTMLInputElement;
const js = document.getElementById("js") as HTMLInputElement;

const senha = document.getElementById("senha") as HTMLInputElement;

let empresas = [];

function criarEmpresa(this: HTMLElement, ev: Event) {
  ev.preventDefault();

  empresas.push([nome.value, cnpj.value, email.value, pais.value, estado.value, cep.value, descricao.value,
    python.checked, java.checked, groovy.checked, c.checked, js.checked, senha.value]);

  console.log(empresas.toString());

}