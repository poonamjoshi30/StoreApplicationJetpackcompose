package com.poonam.storeapplication.presentation.screens.signup

import  androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(

) : ViewModel() {

    private val viewModelState = MutableStateFlow(SignupViewModelState())

    val uiState = viewModelState
        .map { it.toUiState() }
        .stateIn(
            viewModelScope,
            SharingStarted.Eagerly,
            viewModelState.value.toUiState()
        )


    fun onNameInputChanged(nameInput: String) {
        viewModelState.update {
            it.copy(nameInput = nameInput)
        }
    }

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

    fun onPasswordConfirmationInputChanged(passwordConfirmationInput: String) {
        viewModelState.update {
            it.copy(passwordConfirmationInput = passwordConfirmationInput)
        }
    }

    fun toggleShowPassword(show: Boolean) {
        viewModelState.update {
            it.copy(showPassword = show)
        }
    }



}