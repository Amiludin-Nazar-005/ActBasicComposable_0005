package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin() {
    Box(modifier = Modifier.fillMaxSize()) {

        // Background
        Image(
            painter = painterResource(id = R.drawable.bg_ps),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp, bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Judul
            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(40.dp))


            Image(
                painter = painterResource(id =R.drawable.logo_ps),
                contentDescription = "Logo ps",
                modifier = Modifier.size(140.dp)
            )

            Spacer(modifier = Modifier.height(48.dp))

            // Identitas
            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Amiludin Nazar Ali Ghufron",
                color = Color.Blue,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "20240140005",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Gambar lingkaran
            Image(
                painter = painterResource(id = R.drawable.motor),
                contentDescription = "Gambar motor",
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape)
                    .border(4.dp, Color.White, CircleShape),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TugasLoginPreview() {
    TugasLogin()
}