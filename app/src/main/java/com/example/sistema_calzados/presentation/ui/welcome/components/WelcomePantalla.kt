package com.example.sistema_calzados.presentation.ui.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.sistema_calzados.R
import com.example.sistema_calzados.ui.theme.Sistema_calzadosTheme

@Composable
fun WelcomePantalla() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.verco6),
                contentDescription = "Logo de verco",
                contentScale = ContentScale.FillWidth
            )
            Spacer(
                modifier = Modifier
                    .weight(1f)
            )
        }
        Box(
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RectangleShape)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                MaterialTheme.colors.secondaryVariant
                            ),
                            startY = 0f,
                            endY = 1050f
                        )
                    )
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier
                    .weight(3f)
                )
                Text(
                    "Bienvenido a: ",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.body2
                )
                Text(
                    text = "Calzados",
                    letterSpacing = 0.1.em,
                    fontSize = 40.sp,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h1
                )
                Text(
                    text = "''VERCO''",
                    letterSpacing = 0.2.em,
                    fontSize = 40.sp,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h1
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF283593)),
                    modifier = Modifier.padding(top = 33.dp, bottom = 70.dp).width(244.dp).height(55.dp),

                    content = {
                        Text("Ingresar", color = Color.White,
                            style = MaterialTheme.typography.h4)
                    })
            }
        }

    }
}

@Preview
@Composable
private fun WelcomepantallaPreview() {
    Sistema_calzadosTheme {
        WelcomePantalla()
    }
}