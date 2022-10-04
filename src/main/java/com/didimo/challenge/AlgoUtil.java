package com.didimo.challenge;

import io.quarkus.cache.CacheKey;
import io.quarkus.cache.CacheResult;

public class AlgoUtil {

    @CacheResult(cacheName = "algo-util-calculation-sum")
    public static Long sum(@CacheKey Long value1, @CacheKey Long value2) {
        return value1 + value2;
    }

}
