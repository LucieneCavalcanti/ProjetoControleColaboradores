package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.CargoEntity;

public class CargoRepository extends Conexao {
    public CargoRepository() throws Exception {
        super();
    }
    public boolean inserir(CargoEntity Cargo) throws Exception {
        String sql = "INSERT INTO tbCargos (descricao)  VALUES (?)";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setString(1, Cargo.getDescricao());
        return stmt.executeUpdate() > 0;
    }
    public boolean excluir(int id) throws Exception {
        String sql = "DELETE FROM tbCargos WHERE id = ?";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate() > 0;
    }
    public boolean editar(CargoEntity Cargo) throws Exception {
        String sql = "UPDATE tbCargos SET descricao = ? WHERE id = ?";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setString(1, Cargo.getDescricao());
        stmt.setInt(2, Cargo.getId());
        return stmt.executeUpdate() > 0;
    }
    public ArrayList<CargoEntity> listar() throws Exception {
        String sql = "SELECT * FROM tbCargos order by descricao";
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        ArrayList<CargoEntity> CargoList = new ArrayList<>();
        while (rs.next()) 
            CargoList.add(new CargoEntity(
                rs.getInt("id"), rs.getString("descricao")));
        return CargoList;
    }
    public ArrayList<CargoEntity> pesquisar(String pesquisa) throws Exception {
        String sql = "SELECT * FROM tbCargos WHERE descricao LIKE ? order by descricao";
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        stmt.setString(1, "%" + pesquisa + "%");
        ResultSet rs = stmt.executeQuery();
        ArrayList<CargoEntity> CargoList = new ArrayList<>();
        while (rs.next()) 
            CargoList.add(new CargoEntity(
                rs.getInt("id"), rs.getString("descricao")));
        return CargoList;
    }

}
