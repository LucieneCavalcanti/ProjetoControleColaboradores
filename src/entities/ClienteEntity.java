package entities;

public class ClienteEntity
extends UsuarioEntity {
    private String rg;
    private String cpf;
    public ClienteEntity() {
        super();
         rg = new String();
         cpf = new String();
    }
    public ClienteEntity(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
