package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testFetchData() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock Data");

        ApiService service = new ApiService(api);

        assertEquals("Mock Data", service.fetchData());
    }
}