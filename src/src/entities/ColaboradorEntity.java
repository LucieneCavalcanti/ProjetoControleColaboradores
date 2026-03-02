package entities;

import java.util.ArrayList;

public class ColaboradorEntity 
extends UsuarioEntity{
    private float salario;
    private ArrayList<HistoricoEntity> historicos;
    public ColaboradorEntity() {
        super();
         salario = 0;
         historicos = new ArrayList<HistoricoEntity>();
    }
    public ColaboradorEntity(float salario, ArrayList<HistoricoEntity> historicos) {
        this.salario = salario;
        this.historicos = historicos;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public ArrayList<HistoricoEntity> getHistoricos() {
        return historicos;
    }
    public void setHistoricos(ArrayList<HistoricoEntity> historicos) {
        this.historicos = historicos;
    }
     
}
