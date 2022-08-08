package io.yupiik.kubernetes.bindings.v1_18_9;

import java.util.Objects;

public class APIGroupPreferredVersion {
    private String groupVersion;
    private String version;

    public APIGroupPreferredVersion() {
        // no-op
    }

    public APIGroupPreferredVersion(final String groupVersion,
                                    final String version) {
        // no-op
    }

    public String getGroupVersion() {
        return groupVersion;
    }

    public void setGroupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                groupVersion,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIGroupPreferredVersion)) {
            return false;
        }
        final APIGroupPreferredVersion __otherCasted = (APIGroupPreferredVersion) __other;
        return Objects.equals(groupVersion, __otherCasted.groupVersion) &&
            Objects.equals(version, __otherCasted.version);
    }
}
