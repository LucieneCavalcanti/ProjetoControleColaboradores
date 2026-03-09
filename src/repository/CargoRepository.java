package repository;

import java.sql.PreparedStatement;

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

}
