package io.yupiik.kubernetes.bindings.v1_18_6.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplate {
    private StatefulSetListItemsSpecTemplateMetadata metadata;
    private StatefulSetListItemsSpecTemplateSpec spec;

    public StatefulSetListItemsSpecTemplate() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplate(final StatefulSetListItemsSpecTemplateMetadata metadata,
                                            final StatefulSetListItemsSpecTemplateSpec spec) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetListItemsSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetListItemsSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetListItemsSpecTemplateSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplate)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplate __otherCasted = (StatefulSetListItemsSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
