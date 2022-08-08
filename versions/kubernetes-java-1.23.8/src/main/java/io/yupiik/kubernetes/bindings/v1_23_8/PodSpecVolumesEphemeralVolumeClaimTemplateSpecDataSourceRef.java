package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.Objects;

public class PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef {
    private String apiGroup;
    private String kind;
    private String name;

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef() {
        // no-op
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef(final String apiGroup,
                                                                       final String kind,
                                                                       final String name) {
        // no-op
    }

    public String getApiGroup() {
        return apiGroup;
    }

    public void setApiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroup,
                kind,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef)) {
            return false;
        }
        final PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef __otherCasted = (PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name);
    }
}
