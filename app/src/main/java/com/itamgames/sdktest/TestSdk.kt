package com.itamgames.sdktest

import android.app.Activity
import android.os.Bundle
import android.util.Log


class TestSdk : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("famouis TEST" , "TestSdk : Activity")

    }
}