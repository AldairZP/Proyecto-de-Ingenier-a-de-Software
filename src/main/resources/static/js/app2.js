function sumarAsistentes() {
  const ids = [
    'Eventos-Asistentes-Hombres',
    'Eventos-Asistentes-Mujeres',
    'Evento-Asistentes-Jovenes-Hombres',
    'Evento-Asistentes-Jovenes-Mujeres',
    'Evento-Asistentes-Ninos',
    'Evento-Asistentes-Ninas'
  ];

  let total = 0;

  for (let i = 0; i < ids.length; i++) {
    const input = document.getElementById(ids[i]);
    const value = parseInt(input.value);
    if (!isNaN(value)) {
      total += value;
    }
  }

  document.getElementById('Evento-Asistentes-Total').value = total;
}


const buttonEventos = document.getElementById('Eventos-Boton')
buttonEventos.addEventListener('click', () => {
  console.log(323)

  let url = 'http://localhost:8080/postEventos'
  let tipoEvento = document.getElementById("tipoEvento").value;
  let albergue = document.getElementById("Albergue").value;
  let presupuesto = document.getElementById("Eventos-Presupuesto").value;
  let asistentesHombres = document.getElementById("Eventos-Asistentes-Hombres").value
  let asistentesMujeres = document.getElementById("Eventos-Asistentes-Mujeres").value
  let asistentesJovenesHombres = document.getElementById("Evento-Asistentes-Jovenes-Hombres").value
  let asistentesJovenesMujeres = document.getElementById("Evento-Asistentes-Jovenes-Mujeres").value
  let asistentesNinos = document.getElementById("Evento-Asistentes-Ninos").value
  let asistentesNinas = document.getElementById("Evento-Asistentes-Ninas").value
  let fechaEvento = document.getElementById("Eventos-Fecha").value;
  let descripcion = document.getElementById("Descripcion").value;
  let enviar = 0;

  let data = {
    "tipoEvento": tipoEvento.toUpperCase(),
    "albergue": albergue.toUpperCase(),
    "presupuesto": parseFloat(presupuesto),
    "asistentesHombres": parseInt(asistentesHombres),
    "asistentesMujeres": parseInt(asistentesMujeres),
    "asistentesJovenesHombres": parseInt(asistentesJovenesHombres),
    "asistentesJovenesMujeres": parseInt(asistentesJovenesMujeres),
    "asistentesNinos": parseInt(asistentesNinos),
    "asistentesNinas": parseInt(asistentesNinas),
    "fecha": fechaEvento.toUpperCase(),
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
  }


});

