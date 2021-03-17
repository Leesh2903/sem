package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060");
    }

    @Test
    void testGetEmployee()
    {
        Employee emp = app.getEmployee(10008);
        assertEquals(emp.emp_no, 10008);
        assertEquals(emp.first_name, "Saniya");
        assertEquals(emp.last_name, "Kalloufi");
    }
}