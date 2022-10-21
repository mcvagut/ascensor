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

        //Test para verificar si existe el piso, caso contrario lanzar una excepción.
        @Test
        public void verificarExistenciaPisoLanzarExcepcion() throws Exception{

            //Preparación de la prueba
            Ascensor ascensor = new Ascensor();

            //Lógica de prueba
            exception.expect(Exception.class);
            ascensor.SupervisionDeAscensor(1,1,
                    1,5,"Abierto");

        }

        //Test para verificar el estado de la puerta del ascensor.
        @Test
        public void verificarEstadoDePuertaComienzoDia() throws Exception{

            //Preparación de la prueba
            Ascensor ascensor = new Ascensor();

            //Lógica de prueba
            ascensor.SupervisionDeAscensor(1,1,
                    1,3,"Cerrado");
            exception.expect(Exception.class);
            ascensor.SupervisionDeAscensor(2,1,
                    5,3,"Abierto");
            ascensor.SupervisionDeAscensor(3,1,
                    2,3,"Abierto");
        }


}
