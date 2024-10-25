package com.example.cinaeste.data

import androidx.room.Embedded
import androidx.room.Relation


data class MovieWithCast(
    @Embedded val movie : Movie,
    @Relation(
        parentColumn = "id",
        entityColumn = "fromMovieId"
    )
    val cast:List<Cast>
){

}