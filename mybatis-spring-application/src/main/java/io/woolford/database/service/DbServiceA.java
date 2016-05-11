package io.woolford.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.woolford.database.entity.Record;
import io.woolford.database.mapper.a.DbMapperA;

@Service
public class DbServiceA {

    @Autowired
    private DbMapperA dbMapperA;

    public List<Record> getDabaseARecords(){
        return dbMapperA.getDatabaseARecords();
    }
}

