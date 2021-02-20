package hiutrun.example.movieapp_mvvm.api

import androidx.room.TypeConverter
import hiutrun.example.movieapp_mvvm.models.GenreIds

class Converters {
    @TypeConverter
    fun fromGenreIds(genreIds: GenreIds):String{
        return genreIds.toString()
    }

    @TypeConverter
    fun toGenreIds(string: String): GenreIds {
        var list:MutableList<Int> = mutableListOf()
        val arr = string.split("")
        for (item in arr){
            list.add(item.toInt())
        }
        return GenreIds(list)
    }
}