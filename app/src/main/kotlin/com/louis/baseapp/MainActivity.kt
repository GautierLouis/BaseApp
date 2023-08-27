package com.louis.baseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.louis.baseapp.ui.theme.BaseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            BaseAppTheme {
                AppNavigation()
            }
        }
    }
}


@Composable
fun AppNavigation() {

    val nav = rememberNavController()

    val systemUI = rememberSystemUiController()

    SideEffect {
        systemUI.setSystemBarsColor(Color.Transparent)
    }

    NavHost(
        navController = nav,
        startDestination = "/home"
    ) {

    }
}