package com.example.taskapp.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.taskapp.R

fun ImageView.loadImage(image: String?){
    Glide.with(this).load(image).into(this)

    Glide.with(this).load(image).placeholder(R.drawable.ic_person).into(this)
}
