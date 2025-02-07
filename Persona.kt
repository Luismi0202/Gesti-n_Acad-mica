open class Persona(
    var nombre: String,
    var edad: Int,
    var id: String
) {
    open var rol = "Desconocido"

    open fun mostrarRol(){
        println(this.rol)
    }
}