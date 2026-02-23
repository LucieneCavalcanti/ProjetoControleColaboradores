package entities;

import java.time.LocalDate;

public class HistoricoEntity {
    int id;
    ColaboradorEntity colaborador;
    CargoEntity cargo;
    LocalDate dataInicio;
    LocalDate dataFinal;
}
