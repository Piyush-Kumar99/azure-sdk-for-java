// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.routing;

import com.azure.cosmos.implementation.PartitionKeyRange;

import java.util.Collection;

/**
 * Used internally in request routing in the Azure Cosmos DB database service.
 */
public interface RoutingMapProvider {
    Collection<PartitionKeyRange> getOverlappingRanges(String collectionSelfLink, Range<String> range, boolean forceRefresh);

    PartitionKeyRange tryGetRangeByEffectivePartitionKey(String collectionSelfLink, String effectivePartitionKey);

    PartitionKeyRange getPartitionKeyRangeById(String collectionSelfLink, String partitionKeyRangeId, boolean forceRefresh);

}
