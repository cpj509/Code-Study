const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");


function chkEvent(e){
    e.preventDefault();
    console.log(loginInput.value);
}

loginForm.addEventListener("submit", chkEvent);