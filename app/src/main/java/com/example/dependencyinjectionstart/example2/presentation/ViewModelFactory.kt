package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example2.di.MyApplicationScope
import javax.inject.Inject
import javax.inject.Provider

@MyApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<String, Provider<ViewModel>>
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return viewModelProviders[modelClass.simpleName]?.get() as T
    }
}