package io.yupiik.kubernetes.bindings.v1_18_20.v1;

import io.yupiik.kubernetes.bindings.v1_18_20.Validable;
import io.yupiik.kubernetes.bindings.v1_18_20.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodTemplate implements Validable<PodTemplate> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PodTemplateSpec template;

    public PodTemplate() {
        // no-op
    }

    public PodTemplate(final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
                       final PodTemplateSpec template) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
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

    public PodTemplate apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodTemplate kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PodTemplate metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodTemplate template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    @Override
    public PodTemplate validate() {
        return this;
    }
}
