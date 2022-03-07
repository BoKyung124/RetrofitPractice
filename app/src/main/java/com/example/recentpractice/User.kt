package com.example.recentpractice

import com.google.gson.annotations.SerializedName

class User {
    @SerializedName("title")
    var title: String? = null

    @SerializedName("content")
    var content: String? = null

    @SerializedName("check1")
    var check1: Int? = null

    @SerializedName("check2")
    var check2: Int? = null

    @SerializedName("check3")
    var check3: Int? = null

    @SerializedName("check4")
    var check4: Int? = null

    @SerializedName("check5")
    var check5: Int? = null
}