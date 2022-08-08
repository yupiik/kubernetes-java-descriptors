package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
