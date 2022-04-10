const botao = document.getElementById("logar");
botao?.addEventListener("click", validar);

const login = document.getElementById("login") as HTMLInputElement;

function validar(this: HTMLElement, ev: Event) {
    ev.preventDefault();
    if (login.value.length>14 ){
        window.location.replace("empresa.html");
    }else{
        window.location.replace("candidato.html");
    }

}