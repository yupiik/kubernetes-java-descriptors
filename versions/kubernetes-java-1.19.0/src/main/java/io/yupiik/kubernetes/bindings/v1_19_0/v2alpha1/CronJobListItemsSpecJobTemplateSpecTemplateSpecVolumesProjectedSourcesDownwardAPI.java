package io.yupiik.kubernetes.bindings.v1_19_0.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
