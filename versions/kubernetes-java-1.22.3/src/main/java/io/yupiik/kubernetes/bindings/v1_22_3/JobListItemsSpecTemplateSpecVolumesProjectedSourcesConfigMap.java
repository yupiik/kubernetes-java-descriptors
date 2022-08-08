package io.yupiik.kubernetes.bindings.v1_22_3;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                        final String name,
                                                                        final Boolean optional) {
        // no-op
    }

    public List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
