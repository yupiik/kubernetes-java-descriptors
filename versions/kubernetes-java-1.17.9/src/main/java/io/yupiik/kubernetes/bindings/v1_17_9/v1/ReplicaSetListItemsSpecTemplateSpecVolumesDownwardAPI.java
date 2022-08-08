package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items;

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                 final List<ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
