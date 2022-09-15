package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

//    val component = DaggerNewComponent.create()
//    val keyboard: Keyboard = component.getKeyboard()
//    val memory: Memory = component.getMemory()
//    val monitor: Monitor = component.getMonitor()
//    val mouse: Mouse = component.getMouse()

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }
}