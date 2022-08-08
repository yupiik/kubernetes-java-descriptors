package io.yupiik.kubernetes.bindings.v1_14_1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
