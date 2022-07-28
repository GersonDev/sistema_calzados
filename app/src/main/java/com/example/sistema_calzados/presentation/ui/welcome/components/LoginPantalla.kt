package com.example.sistema_calzados.presentation.ui.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.sistema_calzados.R
import com.example.sistema_calzados.ui.theme.Sistema_calzadosTheme

@Composable
fun LoginPantalla() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(id = R.drawable.verco4),
                contentDescription = "Imagen de login",
                contentScale = ContentScale.FillWidth
            )
            Spacer(
                modifier = Modifier
                    .weight(1f)
            )
        }
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
                        endY = 785f
                    )
                )
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(40.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .weight(3f)
            )
            Text(
                text = " Calzados ''Verco''",
                letterSpacing = 0.1.em,
                fontSize = 32.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h1
            )
            Text(
                text = " Ingresar usuario:",
                fontSize = 22.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h1
            )
            TextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xFFFFFFFF)
                ),
                label = {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.icono_cara),
                            contentDescription = "Nombre"
                        )
                        Text(
                            text = "Nombre y Apellido",
                            color = Color.LightGray,
                            style = MaterialTheme.typography.body1,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
            )
            Spacer(
                modifier = Modifier
                    .weight(0.1f)
            )
            TextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xFFFFFFFF)
                ),
                label = {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.icono_contra),
                            contentDescription = "Contrasena"
                        )
                        Text(
                            text = "Contraseña",
                            color = Color.LightGray,
                            style = MaterialTheme.typography.body1,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
            )
            Spacer(
                modifier = Modifier
                    .weight(0.4f)
            )
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF283593)),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                content = {
                    Text(
                        text = "Registrarse",
                        fontWeight = FontWeight.Bold,
                        color = Color.LightGray,
                        style = MaterialTheme.typography.body1
                    )
                }
            )
            Row(
                modifier = Modifier.padding(top = 50.dp, bottom = 10.dp)
            ) {
                Text(
                    "Si no tienes cuenta ->",
                    style = TextStyle(
                        color = Color.White
                    ),
                    fontSize = 14.sp
                )
                ClickableText(
                    text = AnnotatedString(" Ingrese a Registro"),
                    style = TextStyle(
                        color = Color(0xFF283593),
                        fontSize = 14.sp
                    ),
                    onClick = {}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginPantallaPreview() {
    Sistema_calzadosTheme {
        LoginPantalla()
    }
}