package com.pajasoft.lib

abstract class Vehiculos(val marca: String, val velocidadMaxima: Int) {

    abstract fun tipoVehiculo(): String

    fun mostrarInfo() {
        println("${tipoVehiculo()}: $marca — Vel. máx: $velocidadMaxima km/h")
    }
}

class Auto(marca: String, velMax: Int) : Vehiculos(marca, velMax) {
    override fun tipoVehiculo() = "Auto"
}

class Moto(marca: String, velMax: Int) : Vehiculos(marca, velMax) {
    override fun tipoVehiculo() = "Moto"
}

class Camion(marca: String, velMax: Int) : Vehiculos(marca, velMax) {
    override fun tipoVehiculo() = "Camion"
}

fun main() {
    val vehiculos: List<Vehiculos> = listOf(
        Auto("Toyota", 180),
        Moto("Honda", 220),
        Camion("Volvo", 120)
    )

    for (vehiculos in vehiculos) {
        vehiculos.mostrarInfo()
    }
}