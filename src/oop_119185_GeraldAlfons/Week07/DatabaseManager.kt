package oop_119185_GeraldAlfons.Week07

object DatabaseManager {
    var connectionStatus : String = "Disconnected"
    fun connect() {
        connectionStatus = "Connected to server"
        println("Database is ready.")
    }
}
