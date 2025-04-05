package com.example.aibot

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(onStartChatClicked: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Welcome to Easy Bot",
                style = MaterialTheme.typography.headlineMedium,
                fontSize = 28.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {
                    onStartChatClicked()
                }
            ) {
                Text("Start Chatting")
            }
        }
    }
}
