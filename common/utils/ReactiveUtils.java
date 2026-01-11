package com.northtech.common.utils;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class ReactiveUtils {

    // Example: retry with backoff
    public static <T> Mono<T> retryWithBackoff(Mono<T> mono, int retries, Duration delay) {
        return mono.retryBackoff(retries, delay);
    }
}
