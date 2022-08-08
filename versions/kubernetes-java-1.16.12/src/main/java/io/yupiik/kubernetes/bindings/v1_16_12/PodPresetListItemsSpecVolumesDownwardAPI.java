package io.yupiik.kubernetes.bindings.v1_16_12;

import java.util.List;
import java.util.Objects;

public class PodPresetListItemsSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<PodPresetListItemsSpecVolumesDownwardAPIItems> items;

    public PodPresetListItemsSpecVolumesDownwardAPI() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesDownwardAPI(final Integer defaultMode,
                                                    final List<PodPresetListItemsSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodPresetListItemsSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodPresetListItemsSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesDownwardAPI)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesDownwardAPI __otherCasted = (PodPresetListItemsSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
