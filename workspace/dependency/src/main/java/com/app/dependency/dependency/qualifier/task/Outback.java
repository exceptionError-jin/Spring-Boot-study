package com.app.dependency.dependency.qualifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Data
//@Qualifier("outback")
//@Primary

@Component
@Data
@Qualifier("outback")
@Primary
public class Outback implements Restaurant {
    private int steak = Restaurant.steak + 20000;

    @Override
    public boolean isSalad(){return false;}


//    private int steak = Restaurant.steak + 30000;
//
//    @Override
//    public boolean isSalad(){
//        return false;
//    }
}
