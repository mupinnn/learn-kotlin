package com.mupin.kotlin.coroutines

import kotlinx.coroutines.*

//  Job basic
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("New job started!")
//    }
//
//    //  Memulai job tanpa harus menunggu job tersebut selesai (background task)
//    job.start()
//
//    //  Menunda eksekusi berikutnya sampai job selesai (blocking)
////    job.join()
//    println("Other task")
//}

//  Cancelling job
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("New job started!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job . . .")

    //  Job akan langsung masuk ke state `cancelled` karena job belum pernah dijalankan.
    //  Jika job sudah dijalankan lalu dibatalkan, maka job akan masuk ke dalam state `cancelling`
    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}