package com.corgivn.koinsharedviewmodel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.module

@KoinReflectAPI
val appModule = module {
    // do something
}

@KoinReflectAPI
val viewModelModules = module {
    viewModel { LoginViewModel() }
}