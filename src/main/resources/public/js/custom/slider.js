
const boton = document.getElementsByName('boton')[0];
const btnx = document.getElementsByName('boton')[1];
const boo = document.getElementsByName('boo')[0];

var imagenes = new Array('assets/hamburguesa.png','assets/pizza.png','assets/comida.png','assets/sushi.png')

let listElements = document.querySelector('.list');
let hamburguesa = document.querySelector('.comida');

let img = document.getElementById("imagen");


boton.addEventListener('click',function(){
        listElements.style.left = 0;
});

btnx.addEventListener('click', function(){
    listElements.style.left = "-300px";
})

var contador = 0;
var intervalo = null;

function rotarImagenes(){
    contador++;
    img.src = imagenes[contador%imagenes.length];
    img.style.scale = "0.6";
}

function cambiarImagen(){
    img.style.scale = "0";
    setTimeout(rotarImagenes, 800);
}

function start(){
    rotarImagenes();
    intervalo = setInterval(cambiarImagen,4000);
}

function stop(){
    clearInterval(intervalo);
}
start();