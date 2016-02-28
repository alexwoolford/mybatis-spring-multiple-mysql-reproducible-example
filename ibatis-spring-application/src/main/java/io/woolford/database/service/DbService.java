package io.woolford.database.service;

import io.woolford.database.mapper.DbMapper;
import io.woolford.database.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private DbMapper dbMapper;

    public List<Record> getSolrLookupRecords(){
        return dbMapper.getDatabaseARecords();
    }

}

