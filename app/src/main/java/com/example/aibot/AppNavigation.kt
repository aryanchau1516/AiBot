package com.example.aibot

import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@RequiresApi(35)
@Composable
fun AppNavigation(viewModel: ChatViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {

        composable("welcome") {
            WelcomeScreen(onStartChatClicked = {
                navController.navigate("chat")
            })
        }

        composable("chat") {
            ChatPage(viewModel = viewModel, navController = navController)
        }
    }
}
