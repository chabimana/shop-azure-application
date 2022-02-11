package rw.rdss.initializer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import rw.rdss.data.Shop;


@Component
public class DataReader implements CommandLineRunner
{
    @Autowired
    private ResourceLoader resourceLoader;

    List<Shop> shopList = new ArrayList<>();

    @Override
    public void run(final String... args) throws Exception
    {
        final ObjectMapper objectMapper = new ObjectMapper();
        final ClassPathResource resource = new ClassPathResource("/data.json");
        try
        {
            final var dataArray = FileCopyUtils.copyToByteArray(resource.getInputStream());
            final Shop[] shops = objectMapper.readValue(new String(dataArray, StandardCharsets.UTF_8), Shop[].class);
            shopList.addAll(Arrays.asList(shops));
        }
        catch (final IOException ignored)
        {

        }
    }

    public List<Shop> getShopList()
    {
        return shopList;
    }
}
