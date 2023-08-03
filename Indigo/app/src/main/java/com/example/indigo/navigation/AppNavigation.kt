package com.example.parimatchaso.navigation

import FakeScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.afterfonbbet.screens.StartPage.StartScreen
import com.example.indigo.screens.BannerScreen.BannerScreen
import com.example.parimatchaso.screens.FakeScreen.FakeScreenViewModel
import com.example.parimatchaso.screens.MainScreen.MainScreen
import com.example.parimatchaso.screens.SplashScreen.SplashScreen


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigation(viewModel: FakeScreenViewModel = hiltViewModel()) {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SplashScreen.name ){
        composable(Screens.MainScreen.name+"/{id}"){ backStackEntry ->
            val id= backStackEntry.arguments?.getString("id")
            MainScreen(navController, link = id)
        }
        composable(Screens.FakeScreen.name){
            FakeScreen(navController)
        }
        composable(Screens.SplashScreen.name){
            SplashScreen(navController = navController )
        }

        composable(Screens.StartScreen.name){
            StartScreen(navController = navController)
        }
        composable(Screens.BannerScreen.name){
            BannerScreen()
        }
    }

}