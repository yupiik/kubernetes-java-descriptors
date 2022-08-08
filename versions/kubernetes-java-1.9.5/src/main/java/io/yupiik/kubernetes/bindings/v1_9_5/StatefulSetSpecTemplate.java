package io.yupiik.kubernetes.bindings.v1_9_5;

import java.util.Objects;

public class StatefulSetSpecTemplate {
    private StatefulSetSpecTemplateMetadata metadata;
    private StatefulSetSpecTemplateSpec spec;

    public StatefulSetSpecTemplate() {
        // no-op
    }

    public StatefulSetSpecTemplate(final StatefulSetSpecTemplateMetadata metadata,
                                   final StatefulSetSpecTemplateSpec spec) {
        // no-op
    }

    public StatefulSetSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetSpecTemplateSpec spec) {
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
        if (!(__other instanceof StatefulSetSpecTemplate)) {
            return false;
        }
        final StatefulSetSpecTemplate __otherCasted = (StatefulSetSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
