package tmall.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tmall.service.ConfigService;
import tmall.service.ProductService;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductTest extends AbstractJUnit4SpringContextTests {
    @Resource
    ProductService productService;
    @Autowired
    ConfigService configService;
    @Test
    public void getProduct() throws Exception {
//        productService.get(5);
//        System.out.println("test");
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource(""));
        System.out.println(configService.map());
    }
}
