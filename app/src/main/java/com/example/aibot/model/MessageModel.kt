package com.example.aibot.model

data class MessageModel(
    val message: String,
    val role: String,
)
/**
 *  val generativeModel : GenerativeModel = GenerativeModel(
 *         modelName = "gemini-1.5-pro",
 *         apiKey = Constants.apiKey
 *     )
 */
