package kr.ac.kumoh.s20190703.prof.w0303viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    private var _count = MutableLiveData<Int>(0)
    val count : LiveData<Int>
        get() = _count

    fun add() {
        _count.value?.plus(1)
    }
}

//class CounterViewModel : ViewModel(){
//    private var _count = 0
//    var count
//        get() = _count
//        set(value) { _count = value}
//
//    fun add() { _count++ }
//
//}