package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {
    private ReportBuilder builder;

    @BeforeEach
    void setUp() {
        this.builder = new ReportBuilder(new БазаДаних());
    }

    @Test
    void getUserData() {
        assertEquals("hello", builder.getUserData());
    }

    @Test
    void getStatisticData() {
        assertEquals("hello2", builder.getStatisticData());
    }
}