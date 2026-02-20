package oop_119185_GeraldAlfons.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            //Warning : Kode dibawah berbahaya! salah!!
            //Memanggil setter di dalam setter (Recursive)
            this.salary = value
        }
    
}
