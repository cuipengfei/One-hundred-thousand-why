package controller;

import SpringAutowirePrimitive.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@ContextConfiguration("/resources/SpringContextForTests.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class HomeControllerTest {
    @Autowired
    private HomeController homeController;

    @Test
    public void testTest() throws Exception {
        homeController.test(null);
        assertThat(homeController.getTryInjectInteger(), is(123));
    }
}
