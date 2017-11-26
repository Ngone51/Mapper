package tk.mybatis.mapper.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.model.Pinyin2Countryname;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author wuyi
 * @date 2017/11/26
 */
public class CountryCodeTypeHandler extends BaseTypeHandler<Pinyin2Countryname>{
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Pinyin2Countryname p2c, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, p2c.getName());
    }

    @Override
    public Pinyin2Countryname getNullableResult(ResultSet resultSet, String s) throws SQLException {
        if ("China".equals(resultSet.getString(s))) {
            return Pinyin2Countryname.valueOf("ZhongGuo");
        } else {
            return Pinyin2Countryname.valueOf("MeiGuo");
        }
    }

    @Override
    public Pinyin2Countryname getNullableResult(ResultSet resultSet, int i) throws SQLException {
        if ("China".equals(resultSet.getString(i))) {
            return Pinyin2Countryname.valueOf("ZhongGuo");
        } else {
            return Pinyin2Countryname.valueOf("MeiGuo");
        }    }

    @Override
    public Pinyin2Countryname getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        if ("China".equals(callableStatement.getString(i))) {
            return Pinyin2Countryname.valueOf("ZhongGuo");
        } else {
            return Pinyin2Countryname.valueOf("MeiGuo");
        }    }
}
