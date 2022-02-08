package com.fourapplecompose.mynotepad.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fourapplecompose.mynotepad.R
import com.fourapplecompose.mynotepad.ui.theme.mediumGreen

@Composable
fun AppLogo() {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.four_apple_jpg),
            contentDescription = stringResource(R.string.apple_logo),
            Modifier.size(30.dp)
        )
        Text(
            text = stringResource(R.string.apple_apps),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.mediumGreen
        )
        MyUrl()


    }
}


@Preview(showBackground = true)
@Composable
fun AppLogoPreview() {
    AppLogo()
}
