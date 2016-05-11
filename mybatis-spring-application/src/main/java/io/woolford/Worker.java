package io.woolford;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import io.woolford.database.mapper.a.DbMapperA;
import io.woolford.database.mapper.b.DbMapperB;

@Component
public class Worker {

    @Autowired
    DbMapperA dbMapperA;

    @Autowired
    DbMapperB dbMapperB;

    @Scheduled(fixedDelay = 10000L)
    public void run(){
        System.out.println("dbMapperA records: " + dbMapperA.getDatabaseARecords());
        System.out.println("dbMapperB records: " + dbMapperB.getDatabaseBRecords());
    }

}
