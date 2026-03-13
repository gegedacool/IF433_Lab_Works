package oop_119185_GeraldAlfons.week06

class SmartSpeaker {
    class SmartSpeaker(
        override val id: String,
        override val name: String
    ) : SmartDevice, Switchable {

        override fun turnOn() {
            println("[$name] Speaker aktif, menunggu perintah suara...")
        }

        override fun turnOff() {
            println("[$name] Speaker standby/mati.")
        }

        fun playMusic(song: String) {
            println("[$name] Memutar lagu $song dari Spotify.")
        }
    }
}