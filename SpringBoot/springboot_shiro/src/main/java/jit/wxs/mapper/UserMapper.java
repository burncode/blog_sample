package jit.wxs.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import jit.wxs.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jitwxs
 * @since 2018-03-20
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);
}
