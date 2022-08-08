package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecVolumesProjectedSourcesDownwardAPI {
    private List<PodListItemsSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public PodListItemsSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public PodListItemsSpecVolumesProjectedSourcesDownwardAPI(final List<PodListItemsSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<PodListItemsSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodListItemsSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final PodListItemsSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (PodListItemsSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
