package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
