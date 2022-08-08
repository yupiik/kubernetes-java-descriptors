package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> items;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                             final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
