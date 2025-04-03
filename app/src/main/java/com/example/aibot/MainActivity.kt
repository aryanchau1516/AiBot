package com.example.aibot

import androidx.activity.ComponentActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.launch
import androidx.room.*
import com.example.aibot.ui.theme.AiBotTheme
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val chatViewModel = ViewModelProvider(this)[ChatViewModel::class.java]
        setContent {
            AiBotTheme {



                        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                            ChatPage(modifier = Modifier.padding(innerPadding),chatViewModel)
                        }
                    }
                }
            }
        }
