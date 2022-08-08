package io.yupiik.kubernetes.bindings.v1_12_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_12_1.Validable;
import io.yupiik.kubernetes.bindings.v1_12_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class APIService implements Validable<APIService> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private APIServiceSpec spec;
    private APIServiceStatus status;

    public APIService() {
        // no-op
    }

    public APIService(final String apiVersion,
                      final String kind,
                      final ObjectMeta metadata,
                      final APIServiceSpec spec,
                      final APIServiceStatus status) {
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

    public APIServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(final APIServiceSpec spec) {
        this.spec = spec;
    }

    public APIServiceStatus getStatus() {
        return status;
    }

    public void setStatus(final APIServiceStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIService)) {
            return false;
        }
        final APIService __otherCasted = (APIService) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public APIService apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIService kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public APIService metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public APIService spec(final APIServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    public APIService status(final APIServiceStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public APIService validate() {
        return this;
    }
}
