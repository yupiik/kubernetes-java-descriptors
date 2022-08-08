package io.yupiik.kubernetes.bindings.v1_16_0.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
