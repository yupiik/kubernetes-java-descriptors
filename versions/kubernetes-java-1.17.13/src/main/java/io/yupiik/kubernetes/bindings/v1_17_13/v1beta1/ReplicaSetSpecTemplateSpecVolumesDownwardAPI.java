package io.yupiik.kubernetes.bindings.v1_17_13.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems> items;

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                        final List<ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesDownwardAPI __otherCasted = (ReplicaSetSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
