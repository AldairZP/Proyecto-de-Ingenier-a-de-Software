const container = document.getElementById('container');
const registerBtn = document.getElementById("Interna-Externa");
const loginBtn = document.getElementById('Externa-Interna');

registerBtn.addEventListener('click', () => {
  container.classList.add("active");
});

loginBtn.addEventListener('click', () => {
  container.classList.remove("active");
});

var dropdowns = document.getElementsByClassName("dropdown");
for (var i = 0; i < dropdowns.length; i++) {
  dropdowns[i].addEventListener('click', function () {
    this.querySelector('.dropdown-content').classList.toggle('show');
  });
}

const buttonExterna = document.getElementById('Externa-Boton')
buttonExterna.addEventListener('click', () => {

  let url = 'http://localhost:8080/postVisitaExterna'
  let nombreVisitante = document.getElementById("Externa-Nombre").value;
  let tipoVisita = document.getElementById("Externa-Externa").value;
  let albergue = document.getElementById("Albergue").value;
  let fechaVisita = document.getElementById("Externa-Fecha").value;
  let presupuesto = document.getElementById("Externa-Presupuesto").value;
  let motivo = document.getElementById("Externa-Motivo").value;
  let enviar = 0;

  let data = {
    "nombreVisitante": nombreVisitante.toUpperCase(),
    "tipoVisita": "EXTERNA",
    "albergue": albergue.toUpperCase(),
    "fechaVisita": fechaVisita.toUpperCase(),
    "presupuesto": parseFloat(presupuesto),
    "motivo": motivo.toUpperCase()
  };

  Object.entries(data).forEach(([key, value]) => {
    if (value == undefined || value == null || value == "") {
      enviar++;
    }
  });

  if (enviar == 0) {

    console.log(data);

    fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(data)
    })
      .then(response => response.json())
      .then(data => console.log(data))
      .catch((error) => {
        console.error('Error:', error);
      });
  };


});

const buttonInterna = document.getElementById('Interna-Boton');
buttonInterna.addEventListener('click', () => {

  let url = 'http://localhost:8080/postVisitaInterna'
  let nombreVisitante = document.getElementById("Interna-Nombre").value;
  let tipoVisita = document.getElementById("Interna-Interna").value;
  let lugar = document.getElementById("Lugar").value;
  let fechaVisita = document.getElementById("Interna-Fecha").value;
  let personaVisitada = document.getElementById("Interna-Perosna").value;
  let descripcion = document.getElementById("Descripcion").value;
  let enviar = 0;

  let data = {
    "nombreVisitante": nombreVisitante.toUpperCase(),
    "tipoVisita": "INTERNA",
    "fechaVisita": fechaVisita.toUpperCase(),
    "albergue": lugar.toUpperCase(),
    "personaVisitada": personaVisitada.toUpperCase(),
    "descripcion": descripcion.toUpperCase()
  };

  Object.entries(data).forEach(([key, value]) => {
    if (value == undefined || value == null || value == "") {
      enviar++;
    }
  });

  if (enviar == 0) {

    console.log(data);

    fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(data)
    })
      .then(response => response.json())
      .then(data => console.log(data))
      .catch((error) => {
        console.error('Error:', error);
      });

  };

});
