package it.polimi.aip.javisti.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GruppoRicercatoriTest extends AppEngineTestCase {

    private GruppoRicercatori model = new GruppoRicercatori();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
