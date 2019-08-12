package data

class City(val title: String,
           val area: Double) {

    private val people: MutableList<People> = mutableListOf()
    private val houses: MutableList<House> = mutableListOf()

    fun add(people: People) {
        this.people.add(people)
    }

    fun remove(people: People) {

        for(temp in this.people) {
            if(temp == people) {
                this.people.remove(people)
                break
            }
        }
    }

    fun add(house: House) {
        this.houses.add(house)
    }

    fun remove(house: House) {

        for(temp in houses) {

            if(temp == house) {
                this.houses.remove(house)
                break
            }
        }
    }

}

