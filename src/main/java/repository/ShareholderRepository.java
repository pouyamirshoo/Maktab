package repository;

import models.Brands;
import models.Shareholder;
import service.BrandService;
import utility.ApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShareholderRepository {
    private final Connection connection;

    public ShareholderRepository(Connection connection) {
        this.connection = connection;
    }
    public int save(Shareholder shareholder) throws SQLException {

        String save = "INSERT INTO shareholder(shareholder_name,shareholder_phone_number,shareholder_national_code) VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(save);
        preparedStatement.setString(1,shareholder.getShareHolderName());
        preparedStatement.setString(2,shareholder.getShareHolderPhoneNumber());
        preparedStatement.setString(3,shareholder.getShareHolderNationalCode());
        int result = preparedStatement.executeUpdate();
        return result;
    }
    public Shareholder takeOBJid(Shareholder shareholder) throws SQLException {

        String sql = "SELECT * FROM shareholder WHERE shareholder_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, shareholder.getShareHolderName());
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int fk = resultSet.getInt("shareholder_id");
            Shareholder shareholder1 = new Shareholder(fk);
            return shareholder1;
        }
        else
            return null;
    }

}
