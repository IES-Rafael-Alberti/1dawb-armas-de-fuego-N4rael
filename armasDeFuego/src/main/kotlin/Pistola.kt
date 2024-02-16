class Pistola(municion: Int,
              tipoDeMunicion: String,
              danio: Int,
              radio: enumRadio
) : ArmaDeFuego("Pistola", municion, 1,tipoDeMunicion) {
    override var danio: Int = danio
        set(value) {
            requireDanio(value)
            field = value
        }

    override var radio: enumRadio = radio
        set(value) {
            requireRadio(value)
            field = value
        }

    private fun requireDanio(danio: Int){
        require(danio in 1..5) {"Error danio"}
    }

    private fun requireRadio(radio: enumRadio){
        require(radio == enumRadio.REDUCIDO || radio == enumRadio.CORTO) {"Error radio"}
    }
}