class Bazooka(
    municion: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: enumRadio
) : ArmaDeFuego("Bazooka", municion, 3, tipoDeMunicion) {
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
        require(danio in 10..30) { "Error danio" }
    }

    private fun requireRadio(radio: enumRadio) {
        require(radio == enumRadio.INTERMEDIO || radio == enumRadio.ENORME) { "Error radio" }
    }
}