package com.itzhanghada;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/*

 *测试类

 */
@DisplayName("测试类")
public class UserServiceTest {
    @BeforeAll
    public static void Before() {
        System.out.println("11");
    }

    @AfterAll
    public static void After() {
        System.out.println(22);
    }


    @Test
    public void testGetAge() {
        UserService UserService = new UserService();
        Integer age = UserService.getAge("100000200010011011");
        System.out.println(age);
    }

    @Test
    public void testGenderWithAssert1() {
        UserService UserService = new UserService();
        String gender = UserService.getGender("100000200010011011");
        Assertions.assertEquals("男", gender, "性别逻辑错误");
    }

    @Test
    public void testGenderWithAssert2() {
        UserService UserService = new UserService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> UserService.getGender(null));
    }

    @DisplayName("测试性别")
    @ParameterizedTest
    @ValueSource(strings = {"100000200010011011", "100000200010011031", "100000200010011051"})
    public void testGetGender(String idGender) {
        UserService UserService = new UserService();
        String gender = UserService.getGender(idGender);
        Assertions.assertEquals("男", gender);
    }

}


