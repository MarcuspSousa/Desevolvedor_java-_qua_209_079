const form = document.querySelector("form");


//arrow function 
const msg = () => {
    //variaveis locais 
    let nome = document.querySelector("#nome").value;
    let idade = document.querySelector("#idade").value;

    if (idade >= 18) {
        alert(`$(nome) e maior de idade`); 
    }
    else {
        alert (`$(nome) e menor de idade`);
    }
}

//evento 
form.addEventListener("submit" , function (evento) {
    event.preventDefault();
    msg();

})