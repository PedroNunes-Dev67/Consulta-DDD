const form = document.querySelector('form');
const stateResp = document.getElementById('stateResp');
const citiesResp = document.getElementById('citiesResp');

form.addEventListener('submit', async (e) => {
    
    e.preventDefault();

    const ddd = document.getElementById('inDDD').value;

    
    try{
        let response = await axios.get(`http://localhost:8080/ddd/${ddd}`);
     
        let {cities, state} = response.data;
        stateResp.innerText="Estado: "+state;
        let text = "";

        cities.forEach(element => {
       
            text+=element+'\n';
        });

    citiesResp.innerText=text;
    }
    catch(error){
        alert('DDD não encontrado');
        form.inDDD.value = "";
        stateResp.innerText= ""
        citiesResp.innerText=""
    }
})
