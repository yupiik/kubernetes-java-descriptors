package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
