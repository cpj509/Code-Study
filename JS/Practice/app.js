const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
const greeting = document.querySelector("#greeting");

const HIDDEN_CLASSNAME = "hidden";
const USERNAME_KEY = "username";

const link = document.querySelector("a");

//1. localstorage를 1번만 paintGreeting에서 조회하는 방식. 오브젝트를 파라미터로 받음.
function chkEvent(e) {
  e.preventDefault();
  const typedUsername = loginInput.value;
  localStorage.setItem(USERNAME_KEY, typedUsername);
  loginForm.classList.add(HIDDEN_CLASSNAME);

  paintGreeting();
}

const savedUsername = localStorage.getItem(USERNAME_KEY); //local storage에서 값 조회.

function paintGreeting() {
  const username = localStorage.getItem("username");
  greeting.innerText = `Hello ${username}`;
  greeting.classList.remove(HIDDEN_CLASSNAME);
}

if (localStorage.getItem(USERNAME_KEY) === null) {
  loginForm.classList.remove(HIDDEN_CLASSNAME);
  loginForm.addEventListener("submit", chkEvent);
} else {
  paintGreeting();
}

//2. localstorage를 2번 조회하지만 paintGreeting의 파라미터가 없는 방식.
// function chkEvent(e) {
//     e.preventDefault();
//     const typedUsername = loginInput.value;
//     localStorage.setItem(USERNAME_KEY, typedUsername);
//     loginForm.classList.add(HIDDEN_CLASSNAME);

//     paintGreeting();
//   }

//   const savedUsername = localStorage.getItem(USERNAME_KEY); //local storage에서 값 조회.

//   function paintGreeting() {
//     const username = localStorage.getItem("username");
//     greeting.innerText = `Hello ${username}`;
//     greeting.classList.remove(HIDDEN_CLASSNAME);
//   }

//   if (localStorage.getItem(USERNAME_KEY) === null) {
//     loginForm.classList.remove(HIDDEN_CLASSNAME);
//     loginForm.addEventListener("submit", chkEvent);
//   } else {
//     paintGreeting();
//   }
