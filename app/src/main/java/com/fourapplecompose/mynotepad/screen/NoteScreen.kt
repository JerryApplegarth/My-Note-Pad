package com.fourapplecompose.mynotepad.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fourapplecompose.mynotepad.R
import com.fourapplecompose.mynotepad.components.AppLogo
import com.fourapplecompose.mynotepad.components.NoteButton
import com.fourapplecompose.mynotepad.components.NoteInputText

@Composable
fun NoteScreen() {
    var account by remember {
        mutableStateOf("")
    }
    var user_name by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var note by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(title = {
            Text(text = stringResource(id = R.string.app_name))
        },
            actions = {
                Icon(
                    modifier = Modifier
                        .padding(end = 4.dp),
                    imageVector = Icons.Rounded.Favorite,
                    contentDescription = "A heart icon",
                    tint = Color.Red
                )
            },
            backgroundColor = Color.Transparent,
            elevation = 4.dp
        )

        //Content
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically


            ) {
                Text(
                    text = "Account:  ",
                    fontWeight = FontWeight.ExtraBold

                    )
                NoteInputText(
                    text = account,
                    label = "Add Account Name",
                    onTextChange = {
                        if (it.all { char ->
                                char.isDefined()
                            }) account = it
                    })
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "User Name:  ",
                    fontWeight = FontWeight.ExtraBold
                    )
                NoteInputText(
                    text = user_name,
                    label = "Add User Name",
                    onTextChange = {
                        if (it.all { char ->
                                char.isDefined()
                            }) user_name = it
                    })
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Password:  ",
                    fontWeight = FontWeight.ExtraBold
                    )
                NoteInputText(
                    text = password,
                    label = "Enter Password",
                    onTextChange = {
                        if (it.all { char ->
                                char.isDefined()
                            }) password = it
                    })
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Note:  ",
                    fontWeight = FontWeight.ExtraBold
                    )
                NoteInputText(
                    text = note,
                    label = "Enter Some kind of note",
                    onTextChange = {
                        if (it.all { char ->
                                char.isDefined()
                            }) note = it
                    })
            }

            Spacer(modifier = Modifier.height(16.dp))
            NoteButton(
                text = "Save",
                onClick = { /*TODO*/ })
            Spacer(modifier = Modifier.height(4.dp))
            Divider()
            AppLogo()
            Spacer(modifier = Modifier.height(4.dp))
            Divider()



        }
    }
}

    @Preview(showBackground = true)
    @Composable
    fun NoteScreenPreview() {
        NoteScreen()
    }