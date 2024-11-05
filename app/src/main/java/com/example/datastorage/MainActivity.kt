package com.example.datastorage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.datastorage.ui.theme.DataStorageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DataStorageTheme {
             Surface(
                 modifier = Modifier.fillMaxSize(),
                 color = MaterialTheme.colorScheme.background
             ) {
                 Greeting()
             }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) { var email by remember { mutableStateOf("") }
    TextField(
        value = email,
        onValueChange = {email = it},
        keyboardActions = KeyboardOptions().copy(keyboardType = KeyboardType.Email)
    )

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}) {
            Text(text = "Guardar Email")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Email")



    }
}

