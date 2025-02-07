class Profesor(
    nombre:String,
    edad:Int,
    id:String,
    var departamento: String,
    var aniosExperiencia: Int
):Persona(nombre,edad,id) {

    override var rol = "Profesor"

    override fun mostrarRol() {
        super.mostrarRol()
    }

    fun mostrarExperiencia(){
        println("El profesor $nombre tiene $aniosExperiencia años de experiencia")
    }
}