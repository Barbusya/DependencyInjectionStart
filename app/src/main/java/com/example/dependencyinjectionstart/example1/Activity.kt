package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

//    val component = DaggerNewComponent.create()
//    val keyboard: Keyboard = component.getKeyboard()
//    val memory: Memory = component.getMemory()
//    val monitor: Monitor = component.getMonitor()
//    val mouse: Mouse = component.getMouse()

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var memory: Memory
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var mouse: Mouse

    init {
        DaggerNewComponent.create().inject(this)
    }
}