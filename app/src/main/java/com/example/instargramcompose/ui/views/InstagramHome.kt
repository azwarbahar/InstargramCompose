package com.example.instargramcompose.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instargramcompose.R
import com.example.instargramcompose.data.DataDummy

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun HomePreview() {
    InstagramHome()
}

@Composable
fun InstagramHome() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Instagram") },
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = MaterialTheme.colors.onSurface,
                elevation = 8.dp,
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_instagram),
                            contentDescription = null
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_send),
                            contentDescription = null
                        )
                    }
                }
            )
        },
        content = {
            InstagramHomeContent()
        }
    )
}

@Composable
fun InstagramHomeContent() {
    Column {
        InstagramStories()
        Divider()
        InstagramPostsList()
    }
}

@Composable
fun InstagramPostsList() {
    val posts = remember { DataDummy.storyList.filter { it.storyImageId != 0 } }
    LazyColumn {
        items(
            items = posts,
            itemContent = {
                InstagramListItem(post = it)
            })
    }
}