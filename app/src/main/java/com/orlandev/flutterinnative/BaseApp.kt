package com.orlandev.flutterinnative

import android.app.Application
import io.flutter.embedding.engine.FlutterEngineGroup


class BaseApp : Application() {
    lateinit var engines: FlutterEngineGroup
    override fun onCreate() {
        super.onCreate()
        engines = FlutterEngineGroup(this)

    }
}
