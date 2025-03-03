/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class studentTest {

    private Student student;

    @BeforeAll
    public static void setUpClass() {
        // Chạy 1 lần trước tất cả các test (nếu cần thiết)
        System.out.println("BeforeAll: Khởi tạo tài nguyên dùng chung.");
    }

    @AfterAll
    public static void tearDownClass() {
        // Chạy 1 lần sau tất cả các test
        System.out.println("AfterAll: Giải phóng tài nguyên dùng chung.");
    }

    @BeforeEach
    public void setUp() {
        // Khởi tạo đối tượng Student trước mỗi test
        student = new Student("S001", "Nguyen Van A", 20);
    }

    @AfterEach
    public void tearDown() {
        // Dọn dẹp sau mỗi test
        student = null;
    }

    @Test
    public void testGetStudentId() {
        // Kiểm tra phương thức getStudentId()
        String expected = "S001";
        String actual = student.getStudentId();
        assertEquals(expected, actual, "getStudentId() nên trả về 'S001'");
    }

    @Test
    public void testGetName() {
        // Kiểm tra phương thức getName()
        String expected = "Nguyen Van A";
        String actual = student.getName();
        assertEquals(expected, actual, "getName() nên trả về 'Nguyen Van A'");
    }

    @Test
    public void testGetAge() {
        // Kiểm tra phương thức getAge()
        int expected = 20;
        int actual = student.getAge();
        assertEquals(expected, actual, "getAge() nên trả về 20");
    }

    @Test
    public void testSetAge() {
        // Kiểm tra phương thức setAge() và getAge()
        student.setAge(25);
        int expected = 25;
        int actual = student.getAge();
        assertEquals(expected, actual, "setAge() nên cập nhật tuổi thành 25");
    }

    @Test
    public void testUpdateName() {
        // Kiểm tra phương thức updateName()
        student.updateName("Le Van B");
        String expected = "Le Van B";
        String actual = student.getName();
        assertEquals(expected, actual, "updateName() nên cập nhật tên thành 'Le Van B'");
    }
}
