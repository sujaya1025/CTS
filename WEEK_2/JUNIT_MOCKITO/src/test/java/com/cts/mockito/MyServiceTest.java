package com.cts.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // 1. Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Inject mock into service
        MyService service = new MyService(mockApi);

        // 3. Call the method
        service.fetchData();

        // 4. Verify the interaction
        verify(mockApi).getData();  
    }
}
