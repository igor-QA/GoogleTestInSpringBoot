package tests;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/application-jdbc.properties")
@TestPropertySource("/application-test.properties") //Здесь проперти для тестов
public class GoogleTests {

    @Autowired
    private MockMvc mockMvc;// Класс мокки для фейк сайта


    @Test
    public void contextLoads() throws Exception {
        this.mockMvc.perform(get("/")) // Фейк слой
                .andDo(print()) // Логи
                .andExpect(status().isOk()) // ожидаем, что вернет код 200
                .andExpect(content().string(containsString("Hello, guest")))
                .andExpect(content().string(containsString("Please, login")));
    }
}