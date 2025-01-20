package com.mytests.spring.springpropertiesdynamicproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class DynamicPropertySourcesTest {

    private static MyPropertiesProvider provider = new MyPropertiesProvider();

    @DynamicPropertySource
    static void messProperties(DynamicPropertyRegistry registry) {
        registry.add("dynamic.props.test.prop1", provider::firstProperty);
        registry.add("dynamic.props.test.prop2", provider::secondProperty);
    }
    // this property is set in application.properties and is overridden in @DynamicPropertySource
    @Value("${dynamic.props.test.prop1}")
    String mess1;
    // this property is set in @DynamicPropertySource only
    @Value("${dynamic.props.test.prop2}")
    String mess2;
    // this property is set in application.properties only
    @Value("${dynamic.props.test.prop3}")
    String mess3;


    @Test
    public void testMess1(){
        assertEquals(mess1,"hello");
    }
    @Test
    public void testMess2(){
        assertEquals(mess2,"bye");
    }

    @Test
    public void testMess3(){
        assertEquals(mess3,"default_prop3");
    }




    private static class MyPropertiesProvider {
        public String firstProperty() {
            return "hello";
        }

        public String secondProperty() {
            return "bye";
        }
    }
}
