package io.yupiik.kubernetes.bindings.v1_16_9.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems> items;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                            final List<ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
