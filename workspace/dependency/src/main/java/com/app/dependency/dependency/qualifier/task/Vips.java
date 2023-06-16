package com.app.dependency.dependency.qualifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Data
//@Qualifier("vips")

@Component
@Data
@Qualifier("vips")
public class Vips implements Restaurant {
//    private int steak = Restaurant.steak - 10000;

    private int steak = Restaurant.steak - 40000;

//    @Override
//    public boolean isSalad(){return true;}

    @Override
    public boolean isSalad() {
        return true;
    }
}
