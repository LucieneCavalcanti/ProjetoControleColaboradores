package entities;

public class CargoEntity {
    private int id;
    private String descricao;
    //construtores
    //setters/getters
    public CargoEntity() {
        id=0;
        descricao=new String();
    }
    public CargoEntity(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}