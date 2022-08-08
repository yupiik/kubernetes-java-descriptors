package io.yupiik.kubernetes.bindings.v1_19_8.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetSpecVolumesProjectedSourcesDownwardAPI {
    private List<PodPresetSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public PodPresetSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public PodPresetSpecVolumesProjectedSourcesDownwardAPI(final List<PodPresetSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<PodPresetSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodPresetSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final PodPresetSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (PodPresetSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
