package hiutrun.example.movieapp_mvvm.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import hiutrun.example.movieapp_mvvm.models.Movie
import hiutrun.example.movieapp_mvvm.repository.MovieRepository
import kotlinx.coroutines.launch

class MovieViewModel(
    val movieRepository: MovieRepository
) : ViewModel() {

    fun saveMovie(movie: Movie) = viewModelScope.launch {
        movieRepository.upsert(movie)
    }
    fun getSavedMovie() = movieRepository.getSavedMovie()

    fun deleteMovie(movie: Movie) = viewModelScope.launch {
        movieRepository.deleteMovie(movie)
    }
}