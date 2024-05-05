
open class Animal(val name: String, val species: String)


class Lion(name: String) : Animal(name, "Lion")
class Monkey(name: String) : Animal(name, "Monkey")
class Penguin(name: String) : Animal(name, "Penguin")


class Enclosure(val id: Int, val size: String, val animalType: String) {
    fun addAnimal(animal: Animal) {
        if (animal.species == animalType) {
            println("${animal.name} успішно додано до вольєру $id")
        } else {
            println("${animal.species} не підходить для вольєру $id")
        }
    }
}

#demo
class Food(val name: String, val quantity: Int, val animalType: String) {
    fun displayInfo() {
        println("Корм для $animalType: $name, Кількість: $quantity")
    }
}

class ZooKeeper(val name: String, val age: Int, val specialty: String) {
    fun displayInfo() {
        println("Ім'я: $name, Вік: $age, Спеціалізація: $specialty")
    }
}

class Inventory(private val animals: List<Animal>, private val enclosures: List<Enclosure>, private val foods: List<Food>, private val zooKeepers: List<ZooKeeper>) {
    fun displayAnimalInfo() {
        println("=== Інформація про тварин ===")
        animals.forEach { println("${it.name} (${it.species})") }
    }

    fun displayZooKeeperInfo() {
        println("=== Інформація про працівників ===")
        zooKeepers.forEach { it.displayInfo() }
    }

    fun displayFoodInfo() {
        println("=== Інформація про корм ===")
        foods.forEach { it.displayInfo() }
    }

    fun displayEnclosureInfo() {
        println("=== Інформація про вольєри ===")
        enclosures.forEach { println("ID: ${it.id}, Розмір: ${it.size}, Тип тварин: ${it.animalType}") }
    }
}

fun main() {
    val lion1 = Lion("Алекс")
    val monkey1 = Monkey("Геннадій")
    val monkey2 = Monkey("Святослав")
    val penguin1 = Penguin("Ковальський")
    val penguin2 = Penguin("Ріко")
    val penguin3 = Penguin("Рядовий")
    val penguin4 = Penguin("Шкіпер")

    val enclosure1 = Enclosure(1, "Великий", "Lion")
    val enclosure2 = Enclosure(2, "Середній", "Monkey")
    val enclosure3 = Enclosure(3, "Маленький", "Penguin")

    val food1 = Food("М'ясо", 10, "Lion")
    val food2 = Food("Банани", 20, "Monkey")
    val food3 = Food("Риба", 20, "Penguin")


    val zooKeeper1 = ZooKeeper("Анна", 30, "Леви")
    val zooKeeper2 = ZooKeeper("Петро", 25, "Мавпи")
    val zooKeeper3 = ZooKeeper("Анастасія", 20, "Пінгвіни")


    val inventory = Inventory(
        listOf(lion1, monkey1, monkey2, penguin1, penguin2, penguin3, penguin4),
        listOf(enclosure1, enclosure2, enclosure3),
        listOf(food1, food2, food3),
        listOf(zooKeeper1, zooKeeper2, zooKeeper3)
    )


    inventory.displayAnimalInfo()

    inventory.displayZooKeeperInfo()

    inventory.displayFoodInfo()

    inventory.displayEnclosureInfo()

    enclosure1.addAnimal(lion1)
    enclosure2.addAnimal(monkey1)
    enclosure2.addAnimal(monkey2)
    enclosure3.addAnimal(penguin1)
    enclosure3.addAnimal(penguin2)
    enclosure3.addAnimal(penguin3)
    enclosure3.addAnimal(penguin4)

}
