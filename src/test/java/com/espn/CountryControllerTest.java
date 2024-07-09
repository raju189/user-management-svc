package com.espn;

import com.espn.dto.Country;
import com.espn.service.CountryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = UserManagementSvcApplication.class)
@ActiveProfiles("test")
public class CountryControllerTest {

    MockMvc mockMvc;

    @MockBean
    private CountryService countryService;

    @Autowired
    private WebApplicationContext webApplicationContext = null;

    @BeforeEach
    void buildApplicationContext() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void fetchSavedCountry() throws Exception {
        var country= new Country();
        country.setCode("IND");
        country.setName("India");
        country.setId(1l);
        when(countryService.getCountryById(1l)).thenReturn(country);

        var request = MockMvcRequestBuilders.get("/country/1").accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc.perform(request).andReturn();

        var response = mvcResult.getResponse();

        Assertions.assertEquals(HttpStatus.OK.value(), response.getStatus());
    }
}
