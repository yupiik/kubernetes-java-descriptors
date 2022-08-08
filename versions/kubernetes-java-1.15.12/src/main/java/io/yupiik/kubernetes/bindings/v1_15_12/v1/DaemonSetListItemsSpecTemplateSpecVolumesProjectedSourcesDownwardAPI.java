package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
