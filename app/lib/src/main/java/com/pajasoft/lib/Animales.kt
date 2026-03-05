package com.pajasoft.lib

open class Animal(val nombre: String, val edad: Int) {

    open fun hacerSonido() {
        println("Sonido genérico.")
    }

    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}

class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Guau!")
    }
}

class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Miau!")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Mu!")
    }
}

fun main() {
    val perro = Perro("Canelo", 7)
    val gato = Gato("Paloma", 4)
    val vaca = Vaca("Pecas", 5)

    perro.describirse()
    perro.hacerSonido()

    gato.describirse()
    gato.hacerSonido()

    vaca.describirse()
    vaca.hacerSonido()
}