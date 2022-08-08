package io.yupiik.kubernetes.bindings.v1_22_8;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                           final String name,
                                                                           final Boolean optional) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
