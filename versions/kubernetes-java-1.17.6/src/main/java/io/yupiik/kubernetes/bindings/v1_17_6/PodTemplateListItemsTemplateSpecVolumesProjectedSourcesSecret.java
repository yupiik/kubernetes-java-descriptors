package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret {
    private List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                         final String name,
                                                                         final Boolean optional) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
