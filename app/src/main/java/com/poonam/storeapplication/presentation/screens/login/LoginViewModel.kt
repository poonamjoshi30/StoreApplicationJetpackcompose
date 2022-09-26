package com.poonam.storeapplication.presentation.screens.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

private const val TAG = "LoginScreenViewModel"

@HiltViewModel
class LoginScreenViewModel @Inject constructor(

) : ViewModel() {


    private val viewModelState = MutableStateFlow(LoginViewModelState())
    val uiState = viewModelState
        .map { it.toUiState() }
        .stateIn(
            viewModelScope,
            SharingStarted.Eagerly,
            viewModelState.value.toUiState()
        )


    fun onEmailInputChanged(emailInput: String) {
        viewModelState.update {
            it.copy(emailInput = emailInput)
        }
    }

    fun onPasswordInputChanged(passwordInput: String) {
        viewModelState.update {
            it.copy(passwordInput = passwordInput)
        }
    }

    fun toggleShowPassword(show: Boolean) {
        viewModelState.update {
            it.copy(showPassword = show)
        }
    }
}