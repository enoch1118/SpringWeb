package ex01;

import com.springweb.ex01.Restaurant;
import com.springweb.ex01.SampleHotel;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/java/com/springweb/ex01/dispatcher-servlet.xml")
@Log4j
public class test {

//    아래 onmethod_={}부분은 jdk의 버전에 따라서 상이하다
    @Setter(onMethod_={@Autowired})
    private Restaurant restaurant;

    @Test
    public void testExist(){
        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("----------");
        log.info(restaurant.getChef());
    }

    @Setter(onMethod_ = {@Autowired})
    private SampleHotel hotel;

    @Test
    public void testExist_Hotel(){
        assertNotNull(hotel);

        log.info(hotel);
        log.info(hotel.getChef());
    }
}
