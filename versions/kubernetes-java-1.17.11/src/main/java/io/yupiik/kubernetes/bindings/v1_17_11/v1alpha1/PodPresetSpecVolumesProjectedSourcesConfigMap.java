package io.yupiik.kubernetes.bindings.v1_17_11.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetSpecVolumesProjectedSourcesConfigMap {
    private List<PodPresetSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public PodPresetSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public PodPresetSpecVolumesProjectedSourcesConfigMap(final List<PodPresetSpecVolumesProjectedSourcesConfigMapItems> items,
                                                         final String name,
                                                         final Boolean optional) {
        // no-op
    }

    public List<PodPresetSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<PodPresetSpecVolumesProjectedSourcesConfigMapItems> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final PodPresetSpecVolumesProjectedSourcesConfigMap __otherCasted = (PodPresetSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
