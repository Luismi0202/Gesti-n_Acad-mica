class Estudiante(
    nombre:String,
    edad:Int,
    id:String,
    var curso: String,
    var calificacionPromedio: Double
):Persona(nombre,edad,id) {
    override var rol = "Estudiante"

    override fun mostrarRol() {
        super.mostrarRol()
    }

    fun mostrarCalificacion(){
        println("La calificación de $nombre es $calificacionPromedio")
    }
}