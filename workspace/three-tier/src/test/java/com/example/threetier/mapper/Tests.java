package com.example.threetier.mapper;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class Tests {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void selectAllTest(){
        Assertions.assertThat(postMapper.selectAll()).hasSize(1);
    }

}
