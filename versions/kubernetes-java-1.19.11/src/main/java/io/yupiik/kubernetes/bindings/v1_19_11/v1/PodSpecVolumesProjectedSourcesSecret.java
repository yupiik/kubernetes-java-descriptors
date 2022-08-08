package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecVolumesProjectedSourcesSecret {
    private List<PodSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public PodSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public PodSpecVolumesProjectedSourcesSecret(final List<PodSpecVolumesProjectedSourcesSecretItems> items,
                                                final String name,
                                                final Boolean optional) {
        // no-op
    }

    public List<PodSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<PodSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof PodSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final PodSpecVolumesProjectedSourcesSecret __otherCasted = (PodSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
