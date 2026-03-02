package entities;
import java.time.LocalDate;

public class OrcamentoEntity {
    private int id;
    private String descricaoCliente;
    private String descricaoColaborador;
    private double valor;
    private ClienteEntity cliente;
    private ColaboradorEntity colaborador;
    private LocalDate dataInclusao;
    private LocalDate dataValidade;
    private StatusEntity status;
    public OrcamentoEntity() {
        id = 0;
        descricaoCliente = new String();
        descricaoColaborador = new String();
        valor = 0.0;
        cliente = new ClienteEntity();
        colaborador = new ColaboradorEntity();
        status = new StatusEntity();
        dataInclusao = LocalDate.now();
        dataValidade = null;
    }
    public OrcamentoEntity(int id, String descricaoCliente, String descricaoColaborador, double valor,
            ClienteEntity cliente, ColaboradorEntity colaborador, LocalDate dataInclusao, LocalDate dataValidade,
            StatusEntity status) {
        this.id = id;
        this.descricaoCliente = descricaoCliente;
        this.descricaoColaborador = descricaoColaborador;
        this.valor = valor;
        this.cliente = cliente;
        this.colaborador = colaborador;
        this.dataInclusao = dataInclusao;
        this.dataValidade = dataValidade;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricaoCliente() {
        return descricaoCliente;
    }
    public void setDescricaoCliente(String descricaoCliente) {
        this.descricaoCliente = descricaoCliente;
    }
    public String getDescricaoColaborador() {
        return descricaoColaborador;
    }
    public void setDescricaoColaborador(String descricaoColaborador) {
        this.descricaoColaborador = descricaoColaborador;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public ClienteEntity getCliente() {
        return cliente;
    }
    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }
    public ColaboradorEntity getColaborador() {
        return colaborador;
    }
    public void setColaborador(ColaboradorEntity colaborador) {
        this.colaborador = colaborador;
    }
    public LocalDate getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    public StatusEntity getStatus() {
        return status;
    }
    public void setStatus(StatusEntity status) {
        this.status = status;
    }
    
}
