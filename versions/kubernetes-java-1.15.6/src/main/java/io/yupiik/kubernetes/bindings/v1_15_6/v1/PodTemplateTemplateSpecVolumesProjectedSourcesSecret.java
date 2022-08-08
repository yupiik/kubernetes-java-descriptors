package io.yupiik.kubernetes.bindings.v1_15_6.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesProjectedSourcesSecret {
    private List<PodTemplateTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public PodTemplateTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesProjectedSourcesSecret(final List<PodTemplateTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                final String name,
                                                                final Boolean optional) {
        // no-op
    }

    public List<PodTemplateTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (PodTemplateTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
