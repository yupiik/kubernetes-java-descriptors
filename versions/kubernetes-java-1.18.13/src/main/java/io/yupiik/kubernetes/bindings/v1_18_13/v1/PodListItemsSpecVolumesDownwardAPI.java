package io.yupiik.kubernetes.bindings.v1_18_13.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<PodListItemsSpecVolumesDownwardAPIItems> items;

    public PodListItemsSpecVolumesDownwardAPI() {
        // no-op
    }

    public PodListItemsSpecVolumesDownwardAPI(final Integer defaultMode,
                                              final List<PodListItemsSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodListItemsSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodListItemsSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof PodListItemsSpecVolumesDownwardAPI)) {
            return false;
        }
        final PodListItemsSpecVolumesDownwardAPI __otherCasted = (PodListItemsSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
