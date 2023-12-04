package com.example.roomsiswa.ui.theme.halaman

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.roomsiswa.AplikasiSiswa
import com.example.roomsiswa.R
import com.example.roomsiswa.data.Siswa
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object DestinasiHome : DestinasiNavigasi{
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun DataSiswa(
    siswa: Siswa,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {

    }
}