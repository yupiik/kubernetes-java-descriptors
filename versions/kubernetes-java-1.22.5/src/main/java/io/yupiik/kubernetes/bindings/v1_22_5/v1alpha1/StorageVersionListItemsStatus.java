package io.yupiik.kubernetes.bindings.v1_22_5.v1alpha1;

import java.util.List;
import java.util.Objects;

public class StorageVersionListItemsStatus {
    private String commonEncodingVersion;
    private List<StorageVersionListItemsStatusConditions> conditions;
    private List<StorageVersionListItemsStatusStorageVersions> storageVersions;

    public StorageVersionListItemsStatus() {
        // no-op
    }

    public StorageVersionListItemsStatus(final String commonEncodingVersion,
                                         final List<StorageVersionListItemsStatusConditions> conditions,
                                         final List<StorageVersionListItemsStatusStorageVersions> storageVersions) {
        // no-op
    }

    public String getCommonEncodingVersion() {
        return commonEncodingVersion;
    }

    public void setCommonEncodingVersion(final String commonEncodingVersion) {
        this.commonEncodingVersion = commonEncodingVersion;
    }

    public List<StorageVersionListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<StorageVersionListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public List<StorageVersionListItemsStatusStorageVersions> getStorageVersions() {
        return storageVersions;
    }

    public void setStorageVersions(final List<StorageVersionListItemsStatusStorageVersions> storageVersions) {
        this.storageVersions = storageVersions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                commonEncodingVersion,
                conditions,
                storageVersions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageVersionListItemsStatus)) {
            return false;
        }
        final StorageVersionListItemsStatus __otherCasted = (StorageVersionListItemsStatus) __other;
        return Objects.equals(commonEncodingVersion, __otherCasted.commonEncodingVersion) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(storageVersions, __otherCasted.storageVersions);
    }
}
