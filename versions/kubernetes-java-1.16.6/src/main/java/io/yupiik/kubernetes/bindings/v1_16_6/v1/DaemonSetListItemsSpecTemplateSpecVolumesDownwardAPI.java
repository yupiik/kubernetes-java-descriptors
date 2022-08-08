package io.yupiik.kubernetes.bindings.v1_16_6.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items;

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                final List<DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
