package io.yupiik.kubernetes.bindings.v1_14_6.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesQuobyte {
    private String group;
    private Boolean readOnly;
    private String registry;
    private String tenant;
    private String user;
    private String volume;

    public PodPresetSpecVolumesQuobyte() {
        // no-op
    }

    public PodPresetSpecVolumesQuobyte(final String group,
                                       final Boolean readOnly,
                                       final String registry,
                                       final String tenant,
                                       final String user,
                                       final String volume) {
        // no-op
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(final String registry) {
        this.registry = registry;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(final String tenant) {
        this.tenant = tenant;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(final String volume) {
        this.volume = volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                readOnly,
                registry,
                tenant,
                user,
                volume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetSpecVolumesQuobyte)) {
            return false;
        }
        final PodPresetSpecVolumesQuobyte __otherCasted = (PodPresetSpecVolumesQuobyte) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(registry, __otherCasted.registry) &&
            Objects.equals(tenant, __otherCasted.tenant) &&
            Objects.equals(user, __otherCasted.user) &&
            Objects.equals(volume, __otherCasted.volume);
    }
}
