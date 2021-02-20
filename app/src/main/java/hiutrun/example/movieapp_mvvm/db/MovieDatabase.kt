package hiutrun.example.movieapp_mvvm.db

import android.content.Context
import androidx.room.*
import hiutrun.example.movieapp_mvvm.api.Converters
import hiutrun.example.movieapp_mvvm.models.Movie

@Database(
    entities = [Movie::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class MovieDatabase :RoomDatabase(){

    abstract fun getMovieDao(): MovieDao

    companion object{
        @Volatile
        private var instance: MovieDatabase?=null
        private val LOCK = Any()
        operator fun invoke(context: Context)= instance?: synchronized(LOCK){
            instance?:createDatabase(context).also{
                instance = it
            }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                    context.applicationContext,
                    MovieDatabase::class.java,
                    "movie_db.db"
            ).build()
    }
}