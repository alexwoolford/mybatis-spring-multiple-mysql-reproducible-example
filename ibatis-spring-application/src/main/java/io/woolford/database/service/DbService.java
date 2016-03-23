package io.woolford.database.service;

import io.woolford.database.mapper.DbMapperA;
import io.woolford.database.entity.Record;
import io.woolford.database.mapper.DbMapperB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private DbMapperA dbMapperA;

    @Autowired
    private DbMapperB dbMapperB;

    public List<Record> getDabaseARecords(){
        return dbMapperA.getDatabaseARecords();
    }

    public List<Record> getDabaseBRecords(){
        return dbMapperB.getDatabaseBRecords();
    }

}

