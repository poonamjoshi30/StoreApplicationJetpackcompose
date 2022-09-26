package com.poonam.storeapplication.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.poonam.storeapplication.R

private val GilroyFontFamily = FontFamily(
    Font(R.font.gilroysemibold, weight = FontWeight.SemiBold),
    Font(R.font.gilroymedium, weight = FontWeight.Medium),
    Font(R.font.gilroybold, weight = FontWeight.Bold)

)
val Typography = Typography(
    defaultFontFamily = GilroyFontFamily,
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontSize = 54.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.White,
        lineHeight = 29.sp,
        letterSpacing = 16.sp
    ),
    h3 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        lineHeight = 15.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.White,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    h2 = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color(0xff030303),
        lineHeight = 29.sp,
        letterSpacing = 0.sp,
        textAlign = TextAlign.Start
    ),
    h4 = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color(0xff030303),
        lineHeight = 29.sp,
        letterSpacing = 0.sp,
        textAlign = TextAlign.Start
    ),
    caption = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color(0xff828282),
        lineHeight = 0.sp,
        letterSpacing = 0.sp,
        textAlign = TextAlign.Center
    ),
    h6 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        color = Color(0xff181725),
        lineHeight = 1.08.sp,
        letterSpacing = 0.sp,
        textAlign = TextAlign.End
    ),
    h5 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        color = Color(0xff7c7c7c),
        lineHeight = 1.1.sp,
        letterSpacing = 0.sp,
        textAlign = TextAlign.Start
    )
)
val itemNameTextStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    color = Color(0xff181725),
    lineHeight = 18.sp,
    letterSpacing = 0.1.sp,
    fontFamily = FontFamily(Font(R.font.gilroybold, weight = FontWeight.Bold)),
    textAlign = TextAlign.Start
)
val itemPriceTextStyle = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.SemiBold,
    color = Color(0xff181725),
    lineHeight = 18.sp,
    letterSpacing = 0.1.sp,
    fontFamily = FontFamily(Font(R.font.gilroysemibold, weight = FontWeight.SemiBold)),
    textAlign = TextAlign.Start
)
val itemCategoryTextStyle = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.SemiBold,
    color = Color(0xff181725),
    fontFamily = FontFamily(Font(R.font.gilroysemibold, weight = FontWeight.SemiBold)),
    textAlign = TextAlign.Start
)
val seeAllTextStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.SemiBold,
    color = Color(0xff53B175),
    fontFamily = FontFamily(Font(R.font.gilroysemibold, weight = FontWeight.SemiBold)),
    textAlign = TextAlign.Start
)
val headerTextStyle = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    color = Color(0xff181725),
    fontFamily = FontFamily(Font(R.font.gilroybold, weight = FontWeight.Bold)),
    textAlign = TextAlign.Start,
    lineHeight = 18.sp
)
val categoryTextStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    color = Color(0xff181725),
    fontFamily = FontFamily(Font(R.font.gilroybold, weight = FontWeight.Bold)),
    textAlign = TextAlign.Center,
    lineHeight = 22.sp
)
val productTextStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    color = Color(0xff181725),
    fontFamily = FontFamily(Font(R.font.gilroybold, weight = FontWeight.Bold)),
    textAlign = TextAlign.Start,
    lineHeight = 18.sp,
    letterSpacing = 0.1.sp
)
val priceTextStyle = TextStyle(
    fontSize = 14.sp,
    fontWeight = FontWeight.Medium,
    color = Color(0xff7c7c7c),
    fontFamily = FontFamily(Font(R.font.gilroymedium, weight = FontWeight.Medium)),
    textAlign = TextAlign.Start,
    lineHeight = 28.sp
)
val price2TextStyle = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.SemiBold,
    color = Color(0xff181725),
    fontFamily = FontFamily(Font(R.font.gilroysemibold, weight = FontWeight.SemiBold)),
    textAlign = TextAlign.End,
    lineHeight = 27.sp
)

val orderText = TextStyle(
    fontSize = 28.sp,
    fontWeight = FontWeight.Medium,
    color = Color(0xff181725),
    fontFamily = FontFamily(Font(R.font.gilroymedium, weight = FontWeight.Medium)),
    textAlign = TextAlign.Center,
    lineHeight = 21.sp
)