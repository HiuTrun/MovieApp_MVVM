package hiutrun.example.movieapp_mvvm.models

data class GenreIds(
    val list: MutableList<Int>
){
    override fun toString(): String {
        var string = ""
        for ( item in list){
            string += "$item "
        }
        return string
    }
}