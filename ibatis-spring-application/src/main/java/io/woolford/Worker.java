package io.woolford;

import io.woolford.database.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    @Autowired
    DbMapper dbMapper;

    @Scheduled(fixedDelay = 1000L)
    public void run(){
        System.out.println(dbMapper.getDatabaseARecords());
        System.out.println(dbMapper.getDatabaseBRecords());
    }

}
