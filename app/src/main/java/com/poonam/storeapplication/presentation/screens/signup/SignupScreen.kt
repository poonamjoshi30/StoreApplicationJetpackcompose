package com.poonam.storeapplication.presentation.screens.signup

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.poonam.storeapplication.R
import com.poonam.storeapplication.navigation.Screen
import com.poonam.storeapplication.presentation.components.ButtonLoading
import com.poonam.storeapplication.presentation.components.MyTextField
import com.poonam.storeapplication.presentation.components.PasswordInput

@Composable
fun SignupScreen(
    navController: NavController,
    signupViewModel: SignupViewModel = hiltViewModel(),
) {
    val uiState by signupViewModel.uiState.collectAsState()


    val btnEnabled = uiState.nameInput.isNotEmpty()
            && uiState.emailInput.isNotEmpty()
            && uiState.passwordInput.isNotEmpty()
            && uiState.passwordInput == uiState.passwordConfirmationInput


    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Color.Transparent,
        darkIcons = true
    )



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .background(Color(0xfffcfcfc)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Image(painter = painterResource(id = R.drawable.ic_store), contentDescription = null)
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Sign Up",
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(bottom = 6.dp)
        )
        Text(
            text = "Enter your credentials to continue",
            style = MaterialTheme.typography.h3,
            color = Color(0xff727272),
            textAlign = TextAlign.Start, modifier = Modifier
                .padding(bottom = 10.dp)
        )
        MyTextField(
            onInputChanged = signupViewModel::onNameInputChanged,
            inputText = uiState.nameInput,
            name = "Name"
        )
        MyTextField(
            onInputChanged = signupViewModel::onEmailInputChanged,
            inputText = uiState.emailInput,
            name = "Email"
        )
        PasswordInput(
            onInputChanged = signupViewModel::onPasswordInputChanged,
            inputText = uiState.passwordInput,
            showPassword = uiState.showPassword,
            toggleShowPassword = signupViewModel::toggleShowPassword,
            name = "Password"
        )
        PasswordInput(
            onInputChanged = signupViewModel::onPasswordConfirmationInputChanged,
            inputText = uiState.passwordConfirmationInput,
            showPassword = uiState.showPassword,
            toggleShowPassword = signupViewModel::toggleShowPassword,
            name = "Confirm Password"
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "By continuing you agree to our ", style = MaterialTheme.typography.h5)
            Text(
                text = "Terms of Service",
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.primary
            )
            Text(text = "and ", style = MaterialTheme.typography.h5)
            Text(
                text = "Privacy Policy.",
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.primary
            )
        }
        Spacer(modifier = Modifier.height(22.dp))
        ButtonLoading(
            name = "Sign Up",
            isLoading = uiState.isLoading,
            enabled = btnEnabled,
            onClicked = {

                Log.d("signupScreen: ", uiState.errorMessage)
            })
        Spacer(modifier = Modifier.height(22.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Already have an account?",
                style = MaterialTheme.typography.h6,
                fontFamily = FontFamily(
                    Font(R.font.gilroysemibold, weight = FontWeight.SemiBold)
                ),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(end = 8.dp)
            )
            IconButton(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Screen.Login.route)
                }) {
                Text(
                    text = "Sign in",
                    style = MaterialTheme.typography.h6,
                    fontFamily = FontFamily(
                        Font(
                            R.font.gilroysemibold,
                            weight = FontWeight.SemiBold
                        )
                    ),
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.primary,
                )
            }
        }
    }
}