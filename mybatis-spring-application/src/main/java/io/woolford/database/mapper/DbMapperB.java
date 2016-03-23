package io.woolford.database.mapper;

import io.woolford.database.entity.Record;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DbMapperB {

    @Select("SELECT attribute, value FROM database_b.app_props")
    public List<Record> getDatabaseBRecords();

}
