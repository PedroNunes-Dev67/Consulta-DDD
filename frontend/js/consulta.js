const form = document.querySelector('form');
const stateResp = document.getElementById('state');
const quantCities = document.getElementById('quantCities');
const RequestCities = document.getElementById('RequestCities');

form.addEventListener('submit', async (e) => {
    
    e.preventDefault();

    const ddd = document.getElementById('inDDD').value;

    
    try{
        stateResp.innerText = "Carregando...";
        
        let response = await axios.get(`http://localhost:8080/ddd/${ddd}`);

        let {cities, state} = response.data;
        cities.sort((a,b) => a.localeCompare(b, "pt", {sensitivy: 'base'}));
        stateResp.innerText="Estado: "+state;
        quantCities.innerText = "Com um total de "+cities.length+" cidades";
        let text = "";
        cities.forEach((element,i) => {
            
            text += (i+1)+". "+element+"\n"
        });
        
        RequestCities.innerText = text

        document.getElementById('btnReload').style.visibility = 'visible';

    }
    catch(error){
        alert('DDD não encontrado');
        console.log(error);
    }
})

