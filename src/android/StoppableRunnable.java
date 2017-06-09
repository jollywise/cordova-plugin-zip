package org.apache.cordova;

public abstract class StoppableRunnable implements Runnable
{
    public volatile boolean stopWork;

    /**
     * Safely instructs this thread to stop working,
     * letting it finish it's current unit of work,
     * then doing any necessary cleanup and terminating
     * the thread.  Notice that this does not guarentee
     * the thread will stop, as doUnitOfWork() could
     * block if not properly implemented.
     */
    public void stop() {
        stopWork = true;
    }
}
