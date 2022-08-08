package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
