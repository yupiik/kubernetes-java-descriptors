package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<PodTemplateTemplateSpecVolumesDownwardAPIItems> items;

    public PodTemplateTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                     final List<PodTemplateTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodTemplateTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesDownwardAPI __otherCasted = (PodTemplateTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
