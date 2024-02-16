class Rifle(
    municion: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: enumRadio
) : ArmaDeFuego("Rifle", municion, 2, tipoDeMunicion) {
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

    private fun requireDanio(danio: Int) {
        require(danio in 5..10) { "Error danio" }
    }

    private fun requireRadio(radio: enumRadio) {
        require(radio == enumRadio.CORTO || radio == enumRadio.INTERMEDIO) { "Error radio" }
    }
}