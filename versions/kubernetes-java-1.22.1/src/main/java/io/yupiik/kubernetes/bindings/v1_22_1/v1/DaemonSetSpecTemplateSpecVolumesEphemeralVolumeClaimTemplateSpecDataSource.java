package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource {
    private String apiGroup;
    private String kind;
    private String name;

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource(final String apiGroup,
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource __otherCasted = (DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name);
    }
}
