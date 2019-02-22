package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTest {
    @Autowired()
    private UserService userService;

    @Test
    public void test1() {
        List<User> list = userService.getAll();
        for (User user : list) {
            System.out.println("***" + user);
        }
    }

    @Test
    public void test2() {
        int[] a = {5, 2, 3, 6, 4};
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void test3() {
        int[] b = {5, 2, 3, 6, 4};
    }

}
