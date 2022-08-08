package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems> items;

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                              final List<PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesDownwardAPI __otherCasted = (PodTemplateListItemsTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
