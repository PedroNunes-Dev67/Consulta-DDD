const form = document.querySelector('form');
const RespSuporte = document.getElementById('RespSuporte');

form.addEventListener('submit', async (e) => {

    e.preventDefault();

    let emailUsuario = document.getElementById('inEmail').value;
    let requestUsuario = document.getElementById('inRequest').value;

    emailUsuario = emailUsuario.trim();
    requestUsuario = requestUsuario.trim();

    const Request = {
        email : emailUsuario,
        request : requestUsuario
    }

    try{
        RespSuporte.innerText = "Carregando..."
        let response = await axios.post("http://localhost:8080/ddd/request", Request);

        RespSuporte.innerText = "Mensagem enviada com sucesso!";
        RespSuporte.style.color = "green";
    }
    catch(error){
        alert('Erro ao envivar mensagem ao suporte.')
        RespSuporte.innerText="";
    }


})