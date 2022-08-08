package io.yupiik.kubernetes.bindings.v1_15_10.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI {
    private List<PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI(final List<PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
