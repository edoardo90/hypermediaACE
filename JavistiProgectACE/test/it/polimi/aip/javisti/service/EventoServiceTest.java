package it.polimi.aip.javisti.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EventoServiceTest extends AppEngineTestCase {

    private EventoService service = new EventoService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
