package io.yupiik.kubernetes.bindings.v1_22_0;

import java.util.List;
import java.util.Objects;

public class StorageVersionStatusStorageVersions {
    private String apiServerID;
    private List<String> decodableVersions;
    private String encodingVersion;

    public StorageVersionStatusStorageVersions() {
        // no-op
    }

    public StorageVersionStatusStorageVersions(final String apiServerID,
                                               final List<String> decodableVersions,
                                               final String encodingVersion) {
        // no-op
    }

    public String getApiServerID() {
        return apiServerID;
    }

    public void setApiServerID(final String apiServerID) {
        this.apiServerID = apiServerID;
    }

    public List<String> getDecodableVersions() {
        return decodableVersions;
    }

    public void setDecodableVersions(final List<String> decodableVersions) {
        this.decodableVersions = decodableVersions;
    }

    public String getEncodingVersion() {
        return encodingVersion;
    }

    public void setEncodingVersion(final String encodingVersion) {
        this.encodingVersion = encodingVersion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiServerID,
                decodableVersions,
                encodingVersion);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageVersionStatusStorageVersions)) {
            return false;
        }
        final StorageVersionStatusStorageVersions __otherCasted = (StorageVersionStatusStorageVersions) __other;
        return Objects.equals(apiServerID, __otherCasted.apiServerID) &&
            Objects.equals(decodableVersions, __otherCasted.decodableVersions) &&
            Objects.equals(encodingVersion, __otherCasted.encodingVersion);
    }
}
