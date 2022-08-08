package io.yupiik.kubernetes.bindings.v1_14_6.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecVolumesProjectedSourcesDownwardAPI {
    private List<PodSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public PodSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public PodSpecVolumesProjectedSourcesDownwardAPI(final List<PodSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<PodSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final PodSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (PodSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
