package PedroNunesDev.ConsultaDDD.dtos;

public class DtoRequest {

    private String email;
    private String request;

    public DtoRequest(String email, String request) {
        this.email = email;
        this.request = request;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
