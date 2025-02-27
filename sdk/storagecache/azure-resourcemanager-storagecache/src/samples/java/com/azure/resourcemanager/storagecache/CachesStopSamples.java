// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache;

import com.azure.core.util.Context;

/** Samples for Caches Stop. */
public final class CachesStopSamples {
    /**
     * Sample code: Caches_Stop.
     *
     * @param storageCacheManager Entry point to StorageCacheManager. A Storage Cache provides scalable caching service
     *     for NAS clients, serving data from either NFSv3 or Blob at-rest storage (referred to as "Storage Targets").
     *     These operations allow you to manage Caches.
     */
    public static void cachesStop(com.azure.resourcemanager.storagecache.StorageCacheManager storageCacheManager) {
        storageCacheManager.caches().stop("scgroup", "sc", Context.NONE);
    }
}
