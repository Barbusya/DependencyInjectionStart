package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface NewComponent {

//    fun getKeyboard(): Keyboard
//
//    fun getMemory(): Memory
//
//    fun getMonitor(): Monitor
//
//    fun getMouse(): Mouse

    fun inject(activity: Activity)

}