/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.netapp.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2020_09_01.Volumes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.netapp.v2020_09_01.Volume;
import com.microsoft.azure.management.netapp.v2020_09_01.ReplicationStatus;

class VolumesImpl extends WrapperImpl<VolumesInner> implements Volumes {
    private final NetAppManager manager;

    VolumesImpl(NetAppManager manager) {
        super(manager.inner().volumes());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public VolumeImpl define(String name) {
        return wrapModel(name);
    }

    private VolumeImpl wrapModel(VolumeInner inner) {
        return  new VolumeImpl(inner, manager());
    }

    private VolumeImpl wrapModel(String name) {
        return new VolumeImpl(name, this.manager());
    }

    @Override
    public Completable revertAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.revertAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Completable breakReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.breakReplicationAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Completable resyncReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.resyncReplicationAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Completable deleteReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.deleteReplicationAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Completable authorizeReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.authorizeReplicationAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Completable reInitializeReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.reInitializeReplicationAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Completable poolChangeAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String newPoolResourceId) {
        VolumesInner client = this.inner();
        return client.poolChangeAsync(resourceGroupName, accountName, poolName, volumeName, newPoolResourceId).toCompletable();
    }

    @Override
    public Observable<Volume> listAsync(final String resourceGroupName, final String accountName, final String poolName) {
        VolumesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName, poolName)
        .flatMapIterable(new Func1<Page<VolumeInner>, Iterable<VolumeInner>>() {
            @Override
            public Iterable<VolumeInner> call(Page<VolumeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VolumeInner, Volume>() {
            @Override
            public Volume call(VolumeInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Volume> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, poolName, volumeName)
        .flatMap(new Func1<VolumeInner, Observable<Volume>>() {
            @Override
            public Observable<Volume> call(VolumeInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Volume)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

    @Override
    public Observable<ReplicationStatus> replicationStatusMethodAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.replicationStatusMethodAsync(resourceGroupName, accountName, poolName, volumeName)
        .map(new Func1<ReplicationStatusInner, ReplicationStatus>() {
            @Override
            public ReplicationStatus call(ReplicationStatusInner inner) {
                return new ReplicationStatusImpl(inner, manager());
            }
        });
    }

}
