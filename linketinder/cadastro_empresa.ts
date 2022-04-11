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

  let validaNome = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testNome = validaNome.test(nome.value);
  if(nome.value === ""){
    nome.value = ""
    alert("Nome não Informado!")
    return 
  }else if(testNome === false){
    nome.value = ""
    alert("Nome Inválido!")
    return 
  }

  let validaCNPJ = new RegExp(/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/),
    testCNPJ = validaCNPJ.test(cnpj.value);
  if(cnpj.value === ""){
    cnpj.value = ""
    alert("CNPJ não Informado!")
    return 
  }else if(testCNPJ === false){
    cnpj.value = ""
    alert("CNPJ Inválido! Utilizar XX.XXX.XXX/0001-XX")
    return 
  }

  let validaEmail = new RegExp(/[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/),
    testEmail = validaEmail.test(email.value);
  if(email.value === ""){
    email.value = ""
    alert("Email não Informado!")
    return 
  }else if(testEmail === false){
    email.value = ""
    alert("Email Inválido! Utilizar email@example.com")
    return 
  }

  let validaPais = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testPais = validaPais.test(pais.value);
  if(pais.value === ""){
    pais.value = ""
    alert("País não Informado!")
    return 
  }else if(testPais === false){
    pais.value = ""
    alert("País Inválido!")
    return 
  }

  let validaEstado = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testEstado = validaEstado.test(estado.value);
  if(estado.value === ""){
    estado.value = ""
    alert("Estado não Informado!")
    return 
  }else if(testEstado === false){
    estado.value = ""
    alert("Estado Inválido!")
    return 
  }

  let validaCEP = new RegExp(/^[0-9]{5}-[0-9]{3}$/),
    testCEP = validaCEP.test(cep.value);
  if(cep.value === ""){
    cep.value = ""
    alert("CEP não Informado!")
    return 
  }else if(testCEP === false){
    cep.value = ""
    alert("CEP Inválido! Utilizar XXXXX-XXX")
    return 
  }

  if(descricao.value === ""){
    descricao.value = ""
    alert("Descrição não Informada!")
    return 
  }

  let validaSenha = new RegExp(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/),
    testSenha = validaSenha.test(senha.value);
  if(senha.value === ""){
    senha.value = ""
    alert("Senha não Informada!")
    return 
  }else if(confirmarSenha.value === ""){
    alert("Confirmação de senha não Informada!")
    return
  }else if(testSenha === false){
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