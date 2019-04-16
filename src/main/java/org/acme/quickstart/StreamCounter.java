package org.acme.quickstart;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.enterprise.context.ApplicationScoped;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;

/**
 * StreamCounter
 */
@ApplicationScoped
public class StreamCounter {

    AtomicInteger counter = new AtomicInteger();

    public Publisher<String> counter() {
        return Flowable.interval(1000, TimeUnit.MILLISECONDS)
            .map(i -> counter.incrementAndGet())
            .map(i -> i.toString());
    }
}