package io.woolford;

import io.woolford.database.mapper.DbMapperA;
import io.woolford.database.mapper.DbMapperB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    @Autowired
    DbMapperA dbMapperA;

    @Autowired
    DbMapperB dbMapperB;

    @Scheduled(fixedDelay = 10000L)
    public void run(){
        System.out.println(dbMapperA.getDatabaseARecords());
        System.out.println(dbMapperB.getDatabaseBRecords());
    }

}
