const boton = document.getElementsByName('boton')[0];
const btnx = document.getElementsByName('boton')[1];
const boo = document.getElementsByName('boo')[0];

var imagenes = new Array('assets/hamburguesa.png','assets/pizza.png','assets/comida.png','assets/sushi.png')

let listElements = document.querySelector('.list');
let hamburguesa = document.querySelector('.comida');

let img = document.getElementById("imagen");


boton.addEventListener('click',function(){
        listElements.style.left = 0;
        /* if(listElements.clientWidth == "0"){
            width = 300;
        }else{
            classbtn.style.display = "inline";

        }
        console.log(width);*/
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

start = function(){
    rotarImagenes();
    intervalo = setInterval(cambiarImagen,4000);
}

stop = function(){
    clearInterval(intervalo);
}

start();

/*let intervalo = null;
let step = "200px"

const start = () => {
    intervalo = setInterval(function(){
        if(hamburguesa.style.width == step){
            hamburguesa.style.width = "0px";
        }else{
            hamburguesa.style.width = step;
        }
    },2000)
}

start();*/

async function awaitUsers(){
    let usuarios;
    await fetch('http://localhost:8082/api/usuarios/')
  	    .then((response) => response.json())
  		    .then((data) => usuarios = data);

	let tabla = document.getElementById('usuarios');
	
	usuarios.forEach(element => {

        var row = document.createElement("tr");

        for(let i = 0; i <= arrayOfUsers.length; i++){
            let column = document.createElement("td");

            column.text = arrayOfUsers[i];

            row.appendChild(column)
        }

		tabla.append(row)
	});
	
	

}

awaitUsers();