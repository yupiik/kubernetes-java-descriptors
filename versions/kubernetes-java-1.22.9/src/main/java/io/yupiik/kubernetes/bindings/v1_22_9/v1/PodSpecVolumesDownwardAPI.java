package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<PodSpecVolumesDownwardAPIItems> items;

    public PodSpecVolumesDownwardAPI() {
        // no-op
    }

    public PodSpecVolumesDownwardAPI(final Integer defaultMode,
                                     final List<PodSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof PodSpecVolumesDownwardAPI)) {
            return false;
        }
        final PodSpecVolumesDownwardAPI __otherCasted = (PodSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
