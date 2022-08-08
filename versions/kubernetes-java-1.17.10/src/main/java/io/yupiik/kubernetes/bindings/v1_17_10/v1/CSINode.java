package io.yupiik.kubernetes.bindings.v1_17_10.v1;

import io.yupiik.kubernetes.bindings.v1_17_10.Validable;
import io.yupiik.kubernetes.bindings.v1_17_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CSINode implements Validable<CSINode> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private CSINodeSpec spec;

    public CSINode() {
        // no-op
    }

    public CSINode(final String apiVersion,
                   final String kind,
                   final ObjectMeta metadata,
                   final CSINodeSpec spec) {
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

    public CSINodeSpec getSpec() {
        return spec;
    }

    public void setSpec(final CSINodeSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINode)) {
            return false;
        }
        final CSINode __otherCasted = (CSINode) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public CSINode apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CSINode kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CSINode metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CSINode spec(final CSINodeSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public CSINode validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
