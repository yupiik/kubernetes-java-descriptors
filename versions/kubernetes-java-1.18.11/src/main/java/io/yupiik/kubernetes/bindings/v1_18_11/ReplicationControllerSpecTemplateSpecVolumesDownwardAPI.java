package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems> items;

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                   final List<ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesDownwardAPI __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
