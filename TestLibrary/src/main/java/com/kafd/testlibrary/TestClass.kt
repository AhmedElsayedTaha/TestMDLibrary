package com.kafd.testlibrary


class TestClass {
    fun doSomething(): Int {
       val result = internalMethod()
        return result
    }

    private fun internalMethod(): Int {
        return 5+6
    }
}