package io.yupiik.kubernetes.bindings.v1_18_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                                           final String name,
                                                                                           final Boolean optional) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
