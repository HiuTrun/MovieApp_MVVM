package hiutrun.example.movieapp_mvvm.repository

import hiutrun.example.movieapp_mvvm.api.RetrofitInstance
import hiutrun.example.movieapp_mvvm.db.MovieDatabase
import hiutrun.example.movieapp_mvvm.models.Movie

class MovieRepository(
    val db : MovieDatabase
) {
    suspend fun getPopularMovie(country:String,language :String,pageNumber:Int) =
        RetrofitInstance.api.getPopularMovies(country,language,pageNumber)

    suspend fun upsert(movie: Movie) = db.getMovieDao().upsert(movie)

    fun getSavedMovie() = db.getMovieDao().getAllMovies()

    suspend fun deleteMovie(movie: Movie) = db.getMovieDao().deleteMovie(movie)
}