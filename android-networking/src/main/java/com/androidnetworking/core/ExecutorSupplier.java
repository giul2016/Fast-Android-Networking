package com.androidnetworking.core;

import java.util.concurrent.Executor;

/**
 * Created by amitshekhar on 22/03/16.
 */
public interface ExecutorSupplier {

    AndroidNetworkingExecutor forNetworkTasks();

    Executor forBackgroundTasks();

    Executor forMainThreadTasks();
}
