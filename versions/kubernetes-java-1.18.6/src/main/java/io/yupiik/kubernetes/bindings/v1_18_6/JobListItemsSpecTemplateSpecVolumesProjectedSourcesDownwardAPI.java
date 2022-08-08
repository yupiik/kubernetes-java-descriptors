package io.yupiik.kubernetes.bindings.v1_18_6;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
