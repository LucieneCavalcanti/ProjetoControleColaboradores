package entities;

import java.time.LocalDate;

public class HistoricoEntity {
    private int id;
    private ColaboradorEntity colaborador;
    private CargoEntity cargo;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    public HistoricoEntity() {
        id = 0;
        colaborador = new ColaboradorEntity();
        cargo = new CargoEntity();
        dataInicio = LocalDate.now();
        dataFinal = LocalDate.now();
    }
    public HistoricoEntity(int id, ColaboradorEntity colaborador, CargoEntity cargo, LocalDate dataInicio,
            LocalDate dataFinal) {
        this.id = id;
        this.colaborador = colaborador;
        this.cargo = cargo;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ColaboradorEntity getColaborador() {
        return colaborador;
    }
    public void setColaborador(ColaboradorEntity colaborador) {
        this.colaborador = colaborador;
    }
    public CargoEntity getCargo() {
        return cargo;
    }
    public void setCargo(CargoEntity cargo) {
        this.cargo = cargo;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }
}