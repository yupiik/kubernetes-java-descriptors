package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret(final List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                     final String name,
                                                                     final Boolean optional) {
        // no-op
    }

    public List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
