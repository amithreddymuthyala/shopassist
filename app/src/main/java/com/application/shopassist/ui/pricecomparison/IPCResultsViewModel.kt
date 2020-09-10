package com.application.shopassist.ui.pricecomparison

import android.app.Application
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class IPCResultsViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private var job: Job = Job()
    private val scope = CoroutineScope(job + Dispatchers.Main)
    private val _text = MutableLiveData<String>().apply {
        value = "This is IPC Results Fragment"
    }
    val text: LiveData<String> = _text
//    private var ipcResultsList=MutableLiveData<LinkedHashMap<String, Double>>()
//    private var _ipcResultsList=MutableLiveData<LinkedHashMap<String, Double>>()
//
//    init {
//
//        val storePriceMap: LinkedHashMap<String, Double>
//
//        val b: Bundle? = arguments
//
//        if (b?.getSerializable("ipc_results") != null)
//            storePriceMap = b.getSerializable("ipc_results") as LinkedHashMap<String, Double>
//
//        scope.launch {
//            __ipcResultsList=MutableLiveData(storePriceMap)
//            ipcResultsList=__ipcResultsList
//        }
//    }
}
