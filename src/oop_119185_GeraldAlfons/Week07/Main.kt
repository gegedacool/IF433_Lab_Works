package oop_119185_GeraldAlfons.Week07

fun main {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connection()

    println("\n=== TEST COMPANION OBJECT ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 23)
    println(reg1)
    println ("Sama? $s{reg1 == reg2}")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser ("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val(userName, userAge) = data1
    println("Destructured : $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Sucsess("Data berhasil ditarik!")

    // ERROR: 'when' expression must be exhaustive
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan : ${response.data}"
        is ApiResponse.Error -> "Tampilkan : ${response.messsage}"
    }
}

