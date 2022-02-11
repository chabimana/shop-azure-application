package rw.rdss.initializer;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import rw.rdss.data.Shop;


@Component
public class DataReader implements CommandLineRunner
{
    private static final Logger LOG = LoggerFactory.getLogger(DataReader.class);

    List<Shop> shopList = new ArrayList<>();

    @Override
    public void run(final String... args) throws Exception
    {
        final ObjectMapper objectMapper = new ObjectMapper();
        final File file = new ClassPathResource("data.json").getFile();
        final Shop[] shops = objectMapper.readValue(file, Shop[].class);
        Arrays.stream(shops).forEach(shop -> shopList.add(shop));
    }

    public List<Shop> getShopList()
    {
        return shopList;
    }
}
