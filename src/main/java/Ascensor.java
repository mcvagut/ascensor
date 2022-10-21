public class Ascensor {
    private final Character[] piso = {  '0',
                                        '0',
                                        '0',};

        //Función para controlar el ascensor, pisos actuales, de persona, destinos, etc
        public String SupervisionDeAscensor(int AscensorPisoActual, int PersonaPisoActual,
                                            int limitePersonas, int pisoDestino, String estadoPuerta) throws Exception {
            crearPersona(PersonaPisoActual);
            ExcesoPersonas(limitePersonas);
            ExcesoPisos(pisoDestino);
            verificarEstadoComienzoDia(AscensorPisoActual,estadoPuerta);
            return llamarAscensor(PersonaPisoActual,pisoDestino);
        }


}



