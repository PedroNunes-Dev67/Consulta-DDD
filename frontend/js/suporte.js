const form = document.querySelector('form');
const RespSuporte = document.getElementById('RespSuporte');


form.addEventListener('submit', (e) => {

    e.preventDefault();

    let email = document.getElementById('inEmail').value;
    let request = document.getElementById('inRequest').value;

    email = email.trim();
    request = request.trim();

    

})