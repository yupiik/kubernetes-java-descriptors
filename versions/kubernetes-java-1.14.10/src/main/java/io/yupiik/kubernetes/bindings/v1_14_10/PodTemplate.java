package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.Objects;

public class PodTemplate {
    private String apiVersion;
    private String kind;
    private PodTemplateMetadata metadata;
    private PodTemplateTemplate template;

    public PodTemplate() {
        // no-op
    }

    public PodTemplate(final String apiVersion,
                       final String kind,
                       final PodTemplateMetadata metadata,
                       final PodTemplateTemplate template) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodTemplateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateTemplate template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplate)) {
            return false;
        }
        final PodTemplate __otherCasted = (PodTemplate) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(template, __otherCasted.template);
    }
}
