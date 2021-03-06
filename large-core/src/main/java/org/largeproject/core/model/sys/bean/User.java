package org.largeproject.core.model.sys.bean;

import lombok.Data;
import org.largeproject.core.model.base.BaseEntity;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User: ZHS
 * Date: 2018/7/13 16:30
 */
@Table
@Data
public class User extends BaseEntity {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String name;

    private String sex;
}

