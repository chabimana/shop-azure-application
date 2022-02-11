package rw.rdss.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rw.rdss.data.Shop;
import rw.rdss.initializer.DataReader;


@RestController
@RequestMapping("/shops")
public class MainController
{
    private final DataReader dataReader;

    public MainController(final DataReader dataReader)
    {
        this.dataReader = dataReader;
    }

    @GetMapping
    public List<Shop> getAllShops()
    {
        return dataReader.getShopList();
    }
}
