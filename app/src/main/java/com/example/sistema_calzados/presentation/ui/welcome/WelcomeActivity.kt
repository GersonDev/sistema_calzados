package com.example.sistema_calzados.presentation.ui.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sistema_calzados.presentation.routes.WelcomeScreen
import com.example.sistema_calzados.presentation.ui.welcome.components.RegistrarPantalla
import com.example.sistema_calzados.presentation.ui.welcome.components.WelcomePantalla
import com.example.sistema_calzados.presentation.viewmodel.MainViewModel
import com.example.sistema_calzados.ui.theme.Sistema_calzadosTheme

class WelcomeActivity : ComponentActivity(){
    private val mainnViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
setContent {
    Sistema_calzadosTheme() {
        MainScreen(
            mainnViewModel
        )
    }
}
    }
}
@Composable
fun MainScreen(
    mainViewModel: MainViewModel
) {
  val navController = rememberNavController()
    NavHost(navController, startDestination = WelcomeScreen.Bienvenida.route){
        composable(WelcomeScreen.Bienvenida.route){
           RegistrarPantalla(
               onClickRango = {

               }
           )
        }
    }
}