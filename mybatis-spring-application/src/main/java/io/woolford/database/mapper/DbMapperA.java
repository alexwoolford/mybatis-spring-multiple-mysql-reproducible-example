package io.woolford.database.mapper;

import io.woolford.database.entity.Record;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DbMapperA {

    @Select("SELECT attribute, value FROM database_a.app_props")
    public List<Record> getDatabaseARecords();

}
