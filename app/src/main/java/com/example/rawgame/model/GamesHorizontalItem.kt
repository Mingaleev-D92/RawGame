package com.example.rawgame.model

import com.example.rawgame.model.base.ListItem

data class GamesHorizontalItem(
   val title: String,
   val games: List<ListItem>
) : ListItem
