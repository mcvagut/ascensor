import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class AscensorTest {

        @Rule
        public ExpectedException exception = ExpectedException.none();

        //Test para la capacidad del Ascensor
        @Test
        public void capacidadAscensor() throws Exception{
            //Preparación de la prueba
            Ascensor ascensor = new Ascensor();

            //Lógica de prueba
            ascensor.SupervisionDeAscensor(1,1,
                    1,3,"Abierto");
            exception.expect(Exception.class);
            ascensor.SupervisionDeAscensor(1,1,
                    2,3,"Abierto");
            ascensor.SupervisionDeAscensor(1,1,
                    3,3,"Abierto");
        }

}
