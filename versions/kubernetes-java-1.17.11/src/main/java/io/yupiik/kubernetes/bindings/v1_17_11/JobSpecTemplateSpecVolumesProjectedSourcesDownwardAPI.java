package io.yupiik.kubernetes.bindings.v1_17_11;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
