package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun buildAquarium2() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}

fun buildAquarium3() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}

fun buildAquarium4() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()
    buildAquarium2()
    buildAquarium3()
    buildAquarium4()
    makeFish()
}