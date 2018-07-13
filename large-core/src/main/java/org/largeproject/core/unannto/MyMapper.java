package org.largeproject.core.unannto;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * User: ZHS
 * Date: 2018/7/13 16:33
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
