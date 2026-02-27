package oop_119185_GeraldAlfons.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}