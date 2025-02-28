fun main(){
    var likes = 471
    
    val likesPeople = if(likes == 1 || likes % 10 == 1 ) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(likesPeople)
}