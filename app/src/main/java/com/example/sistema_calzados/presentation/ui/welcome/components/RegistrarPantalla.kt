package com.example.sistema_calzados.presentation.ui.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.example.sistema_calzados.R
import com.example.sistema_calzados.ui.theme.Sistema_calzadosTheme

@Composable
fun RegistrarPantalla(
) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.verco2),
                contentDescription = "Imagen Verco",
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
                        endY = 1050f
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
                text = "Calzados ''VERCO''",
                letterSpacing = 0.1.em,
                fontSize = 38.sp,
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h1
            )
            Text(
                text = " Crear cuenta de acceso: ",
                fontSize = 20.sp,
                color = Color(0xFF283593),
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.h1
            )
            var expanded by remember { mutableStateOf(false) }
            val list = listOf("Modelista", "Cortador", "Armador", "Aparador", "Acabador")
            var selectedItem by remember { mutableStateOf("") }
            var textFieledSize by remember { mutableStateOf(Size.Zero) }

            val icon = if (expanded) {
                Icons.Filled.KeyboardArrowUp
            } else {
                Icons.Filled.KeyboardArrowDown
            }

            OutlinedTextField(
                value = selectedItem,
                onValueChange = { selectedItem = it },
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .onGloballyPositioned { coordinates ->
                        textFieledSize = coordinates.size.toSize()
                    }
                    .background(Color.White),
                label = {
                    Text(
                        text = "Seleccionar su Rango",
                        color = Color.LightGray,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                },
                trailingIcon = {
                    Icon(icon, "", Modifier.clickable { expanded = !expanded })
                }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(with(LocalDensity.current) { textFieledSize.width.toDp() })
            ) {
                list.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedItem = label
                        expanded = false
                    }) {
                        Text(text = label)
                    }

                }
            }
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
                            text = "Confirme su  Contraseña",
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
                    .weight(0.3f)
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
                modifier = Modifier.
                padding(top = 50.dp, bottom = 10.dp)
            ){
                Text(
                    "Si se registro correctamente->",
                    style = TextStyle(
                        color = Color.White
                    ),
                    fontSize = 14.sp
                )
                ClickableText(
                    text = AnnotatedString(" Vuelve al Login"),
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
private fun RegistrarPantallaPreview() {
    Sistema_calzadosTheme {
        RegistrarPantalla()
    }
}