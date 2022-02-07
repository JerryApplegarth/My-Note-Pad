package com.fourapplecompose.mynotepad.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fourapplecompose.mynotepad.R

@Composable
fun NoteScreen() {
    Column(
        modifier = Modifier
            .padding(6.dp),
    ) {
        TopAppBar(
            modifier = Modifier
                .background(color = Color.Transparent),
            backgroundColor = Color.Transparent,
            elevation = 4.dp
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 8.dp, end = 240.dp),
                text = stringResource(id = R.string.app_name),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
                )

            Icon(
                modifier = Modifier
                    .padding(end = 4.dp),
                imageVector = Icons.Rounded.Favorite,
                contentDescription = "A heart icon",
                tint = Color.Red
                )
        }
    }
    //Content
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}


@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen()
}