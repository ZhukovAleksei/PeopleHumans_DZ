fun main() {
    var likes = 511
    val likesPeople = if (likes % 100 == 11 || likes == 11) {
        "Понравилось $likes людям"
    } else if (likes == 1 || likes % 10 == 1) {
        "Понравилось $likes человеку"
    } else {
        "Понравилось $likes людям"
    }
    println(likesPeople)
}