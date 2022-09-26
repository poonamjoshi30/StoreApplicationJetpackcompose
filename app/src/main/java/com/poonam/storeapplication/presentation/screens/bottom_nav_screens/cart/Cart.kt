package com.poonam.storeapplication.presentation.screens.bottom_nav_screens.cart

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.poonam.storeapplication.navigation.Screen
import com.poonam.storeapplication.ui.theme.headerTextStyle
import com.poonam.storeapplication.ui.theme.itemPriceTextStyle

@Composable
fun MyCart(
    navController: NavHostController,
) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Color.Transparent,
        darkIcons = true
    )


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "My Cart",
            style = headerTextStyle,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))
        Divider(color = Color(0xFFB3B3B3), modifier = Modifier.fillMaxWidth(), thickness = 1.dp)
        Box(
            modifier = Modifier
                .fillMaxHeight(0.75f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "NO DATA FOUND",
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            )


        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier
                .height(57.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = {

                navController.navigate(Screen.Order.route) { launchSingleTop = true }

            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF53B175),
                contentColor = Color(0xFFFFFFFF)
            ),
            shape = RoundedCornerShape(19),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 4.dp,
                pressedElevation = 8.dp
            )
        ) {
            Text(
                text = "Go To Shop",
                style = itemPriceTextStyle,
                color = Color(0xFFFFFFFF)
            )
        }
    }
}


