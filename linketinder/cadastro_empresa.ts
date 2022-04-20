const botaoSalvar = document.getElementById("salvar");
botaoSalvar?.addEventListener("click", criarEmpresa);

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
const confirmarSenha = document.getElementById("confirmar_senha") as HTMLInputElement;

let empresas = [];

function criarEmpresa(this: HTMLElement, ev: Event) {
  ev.preventDefault();

  let validarNome = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testarNome = validarNome.test(nome.value);
  if(nome.value === ""){
    nome.value = ""
    alert("Nome não Informado!")
    return 
  }else if(testarNome === false){
    nome.value = ""
    alert("Nome Inválido!")
    return 
  }

  let validarCNPJ = new RegExp(/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/),
    testarCNPJ = validarCNPJ.test(cnpj.value);
  if(cnpj.value === ""){
    cnpj.value = ""
    alert("CNPJ não Informado!")
    return 
  }else if(testarCNPJ === false){
    cnpj.value = ""
    alert("CNPJ Inválido! Utilizar XX.XXX.XXX/0001-XX")
    return 
  }

  let validarEmail = new RegExp(/[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/),
    testarEmail = validarEmail.test(email.value);
  if(email.value === ""){
    email.value = ""
    alert("Email não Informado!")
    return 
  }else if(testarEmail === false){
    email.value = ""
    alert("Email Inválido! Utilizar email@example.com")
    return 
  }

  let validarPais = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testarPais = validarPais.test(pais.value);
  if(pais.value === ""){
    pais.value = ""
    alert("País não Informado!")
    return 
  }else if(testarPais === false){
    pais.value = ""
    alert("País Inválido!")
    return 
  }

  let validarEstado = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testarEstado = validarEstado.test(estado.value);
  if(estado.value === ""){
    estado.value = ""
    alert("Estado não Informado!")
    return 
  }else if(testarEstado === false){
    estado.value = ""
    alert("Estado Inválido!")
    return 
  }

  let validarCEP = new RegExp(/^[0-9]{5}-[0-9]{3}$/),
    testarCEP = validarCEP.test(cep.value);
  if(cep.value === ""){
    cep.value = ""
    alert("CEP não Informado!")
    return 
  }else if(testarCEP === false){
    cep.value = ""
    alert("CEP Inválido! Utilizar XXXXX-XXX")
    return 
  }

  if(descricao.value === ""){
    descricao.value = ""
    alert("Descrição não Informada!")
    return 
  }

  let validarSenha = new RegExp(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/),
    testarSenha = validarSenha.test(senha.value);
  if(senha.value === ""){
    senha.value = ""
    alert("Senha não Informada!")
    return 
  }else if(confirmarSenha.value === ""){
    alert("Confirmação de senha não Informada!")
    return
  }else if(testarSenha === false){
    senha.value = ""
    alert("Senha Inválida!")
    return 
  }

  if(confirmarSenha.value === ""){
    confirmarSenha.value = ""
    alert("Confirmação de senha não Informada!")
    return
  }else if(senha.value != confirmarSenha.value){
    senha.value = ""
    confirmarSenha.value = ""
    alert("As senhas não são semelhantes!")
    return
  }

  empresas.push([nome.value, cnpj.value, email.value, pais.value, estado.value, cep.value, descricao.value,
    python.checked, java.checked, groovy.checked, c.checked, js.checked, senha.value]);

  console.log(empresas.toString());


}