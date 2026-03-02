package entities;

import java.time.LocalDate;

public class AdministradorEntity 
extends UsuarioEntity{
    private LocalDate dataCadastro;

    public AdministradorEntity() {
        super();
         dataCadastro = LocalDate.now();
    }

    public AdministradorEntity(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
