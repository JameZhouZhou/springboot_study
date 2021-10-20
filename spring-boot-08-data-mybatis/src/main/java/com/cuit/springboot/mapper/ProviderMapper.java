package com.cuit.springboot.mapper;

import com.cuit.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *      使用Mybatis注解版
 */

//可以在启动类注解 @MapperScan
//@Mapper         //指定这是操作数据的Mapper 为了把mapper这个DAO交給Spring管理
public interface ProviderMapper{

    @Select("select * from provider where pid=#{pid}")
    Provider getProviderByPid(Integer pid);

    //useGeneratedKeys是否使用自增主键，keyProperty指定实体类中的哪一个属性封装主键值
    @Options(useGeneratedKeys = true, keyProperty = "pid")
    @Insert("insert into provider(providerName) value(#{providerName})")
    int addProvider(Provider provider);

    @Delete("delete from provider where pid=#{pid}")
    int deleteProiderByPid(Integer pid);

    @Update("update provider set providerName=#{providerName} where pid=#{pid}")
    int updateProvider(Provider provider);

}
