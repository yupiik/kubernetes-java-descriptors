package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class PodTemplateListItems {
    private String apiVersion;
    private String kind;
    private PodTemplateListItemsMetadata metadata;
    private PodTemplateListItemsTemplate template;

    public PodTemplateListItems() {
        // no-op
    }

    public PodTemplateListItems(final String apiVersion,
                                final String kind,
                                final PodTemplateListItemsMetadata metadata,
                                final PodTemplateListItemsTemplate template) {
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

    public PodTemplateListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PodTemplateListItemsTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateListItemsTemplate template) {
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
        if (!(__other instanceof PodTemplateListItems)) {
            return false;
        }
        final PodTemplateListItems __otherCasted = (PodTemplateListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(template, __otherCasted.template);
    }
}
