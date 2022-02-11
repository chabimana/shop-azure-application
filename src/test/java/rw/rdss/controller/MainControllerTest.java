package rw.rdss.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MainControllerTest
{
    @Autowired
    private MainController mainController;

    @Test
    void testShopsCount()
    {
        final var shopCount = mainController.getAllShops().size();
        assertEquals(5, shopCount);
    }
}
