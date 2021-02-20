package hiutrun.example.movieapp_mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import hiutrun.example.movieapp_mvvm.R
import hiutrun.example.movieapp_mvvm.db.MovieDatabase
import hiutrun.example.movieapp_mvvm.repository.MovieRepository

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = MovieRepository(MovieDatabase(this))
        val viewModelProviderFactory = MovieViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory)[MovieViewModel::class.java]
    }
}