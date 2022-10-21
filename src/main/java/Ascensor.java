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

        //Función que crea la persona
        private void crearPersona(int pisoActualPersona) {
            for(int i = 1; i<= piso.length; i++){
            if(i==pisoActualPersona){
                piso[i-1] = '1';
            }
        }
    }


}



