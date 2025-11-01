package PedroNunesDev.ConsultaDDD.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DDD {

    private String estado;
    private List<String> listaDeCidades;

    public DDD() {
    }

    public DDD(String estado, List<String> listaDeCidades) {
        this.estado = estado;
        this.listaDeCidades = listaDeCidades;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getListaDeCidades() {
        return listaDeCidades;
    }

    public void setListaDeCidades(List<String> listaDeCidades) {
        this.listaDeCidades = listaDeCidades;
    }
}
