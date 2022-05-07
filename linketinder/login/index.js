"use strict";
const botao = document.getElementById("logar");
botao === null || botao === void 0 ? void 0 : botao.addEventListener("click", validarLogin);
const login = document.getElementById("login");
function validarLogin(ev) {
    ev.preventDefault();
    if (login.value.length > 14) {
        window.location.replace("empresa.html");
    }
    else {
        window.location.replace("candidato.html");
    }
}
