package com.example.crea_una_cuadricula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.crea_una_cuadricula.model.Cuadricula
import com.example.crea_una_cuadricula.ui.theme.Crea_una_cuadriculaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Crea_una_cuadriculaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cuadriculaApp(
                        modifier =Modifier.padding()
                    )
                }
            }
        }
    }
}

@Composable
fun cuadriculaApp(modifier: Modifier = Modifier){

}

@Composable
fun CuadriculaCard(cuadricula: Cuadricula, modifier: Modifier = Modifier){

}

@Preview
@Composable
fun CuadriculaPreview(){

}