package hiutrun.example.movieapp_mvvm.api

import hiutrun.example.movieapp_mvvm.models.MovieResponse
import hiutrun.example.movieapp_mvvm.util.Constant.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {
    @GET("v3//movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey:String = API_KEY,
        @Query("language")
        language: String,
        @Query("page")
        page:Int =1,
    ):Response<MovieResponse>
}