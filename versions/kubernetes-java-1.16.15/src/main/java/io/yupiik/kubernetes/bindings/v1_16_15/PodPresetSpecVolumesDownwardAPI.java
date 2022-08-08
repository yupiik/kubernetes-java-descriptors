package io.yupiik.kubernetes.bindings.v1_16_15;

import java.util.List;
import java.util.Objects;

public class PodPresetSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<PodPresetSpecVolumesDownwardAPIItems> items;

    public PodPresetSpecVolumesDownwardAPI() {
        // no-op
    }

    public PodPresetSpecVolumesDownwardAPI(final Integer defaultMode,
                                           final List<PodPresetSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodPresetSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodPresetSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof PodPresetSpecVolumesDownwardAPI)) {
            return false;
        }
        final PodPresetSpecVolumesDownwardAPI __otherCasted = (PodPresetSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
