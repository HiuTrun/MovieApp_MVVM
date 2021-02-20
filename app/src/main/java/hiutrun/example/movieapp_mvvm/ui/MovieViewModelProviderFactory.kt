package hiutrun.example.movieapp_mvvm.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import hiutrun.example.movieapp_mvvm.repository.MovieRepository

@Suppress("UNCHECKED_CAST")
class MovieViewModelProviderFactory(
    val repository: MovieRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(repository) as T
    }
}