# java

1. concurrency — Experiments with Java multithreading and concurrency.
    1. youtube-coding-with-john-multithreading-in-java-explained (ytcwjmije) — Examples following the Coding with John "[Multithreading in Java Explained in 10 Minutes](https://youtu.be/r_MbozD32eo?si=SPAV9ockL_86JcY9)" video.
        1. 1 (ytcwjmije1) — Basic threading: `MultithreadThing` extends `Thread`, and two instances are started to run concurrently.
        2. 2 (ytcwjmije2) — Spawns 5 numbered threads in a loop, each printing its count along with its thread number.
        3. 3 (ytcwjmije3) — Switches to `implements Runnable`, passing the instance to a `Thread` object (with a commented-out `join()` example).
